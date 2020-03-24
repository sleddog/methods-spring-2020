package main

import (
	"encoding/json"
	"fmt"
	"log"
	"math/rand"
	"net/http"
	"strconv"
	"text/template"
	"time"
)

// DEFINE TYPES

type board struct {
	values [][]int
}

type dataToServe struct {
	data [][]int
}

// request data type
type requestBody struct {
	Direction string
	Values    []string
}

type responseBody struct {
	NewBoard [][]int
}

//Make Gloabal varaiable of type board to save games into
var globalBoard board

// This Function is the meat - it counts the zeros, removes them, and adds the non-zero values
// the output pointer will track the number of zeros
// 		we need this because if the zeros are directly returned by recusion, the sliding effect will not happen
// the function will return a 2D slice of only the none zero values
func collapseNums6(nums [][]int, output *[]int) [][]int {
	// base case, only one number left
	if len(nums) == 1 {
		// check is this number is a zero
		if nums[0][0] == 0 {
			// if it is, we need to cut it out and move it to beginning.
			// this lets the values "slide through" the zeros
			//prepend a zero
			*output = append([]int{0}, (*output)...)
			// return an empty slice
			return make([][]int, 0)
		}
		// if this is a real number, return it
		return nums

		// second case -- two adjacent numbers are the same
		// add the first to the inner slice holding the second
		// this will esentially stack up all the similar values. at the end, all the values will be added
	} else if nums[0][0] == nums[1][0] {
		// to keep the appropriate spaces prepend a zero
		*output = append([]int{0}, (*output)...)

		//copy to new var
		//a := nums
		// add the first val to the inner slice of second
		nums[1] = append(nums[1], nums[0][0:]...)

		//a[1] = append(a[1], a[0][0:]...)

		// cocatonate into new slice, removing the second entry
		nums = append(nums[1:2], nums[2:]...)

		//b := append(a[1:2], a[2:]...)
		//fmt.Println("b : ", b)
		// call the recursion
		return collapseNums6(nums, output)
		//return collapseNums6(b, output)

		// Final Case -- two adjacent numbers are different
	} else {
		// check if one is a zero
		if nums[0][0] != 0 && nums[1][0] == 0 {

			// if one is a zero, swap them

			// this will cause the recusion to be called on both the zero by itself, which will get removed,
			// and the the remaining values

			// swap them
			tmp := nums[0]
			nums[0] = nums[1]
			nums[1] = tmp
		}
		// call recursion
		return append(collapseNums6(nums[0:1], output), collapseNums6(nums[1:], output)...)
	}
}

// This function will take in a row of values and run them through the collapse
//	function
func processRow(rowVals []int) []int {
	// make the 2D holder
	toCollapse := make([][]int, 4)

	// fill instantiate inner arrays of holders with single values from input rowVals
	// this will set up the infrastructer needed to track duplicated in the collapse function
	for i, v := range rowVals {
		toCollapse[i] = []int{v}
	}

	collapsedVals := make([]int, 0)
	toReturn := make([]int, 0)
	//toReturn := make([]string, 0)

	// collase the row
	j := collapseNums6(toCollapse, &toReturn)
	//fmt.Println("j: ", j)

	// add up the values in each inner array
	for _, v := range j {
		total := 0
		for _, v1 := range v {
			total += v1
		}
		collapsedVals = append(collapsedVals, total)
	}

	// Append the non-zero values to the zeros
	toReturn = append(toReturn, collapsedVals...)

	return toReturn
}

// HTTP handler function
// This Function will serve all requests to "/" url
func indexHandler(w http.ResponseWriter, req *http.Request) {
	//fmt.Println("in index handler")
	err := req.ParseForm()
	if err != nil {
		log.Fatalln("error with get", err)
	}

	//Check if get method has newgame parameter
	if req.Method == "GET" {

		//check for new game request param
		newGame := req.URL.Query()
		//fmt.Println(newGame)

		// If new game was selected, build a new board and then redirect to
		// home page
		if newGame.Get("newgame") == "New Game" {

			//make new board
			newBoard := makeNewBoard()

			//assign globalBoard
			globalBoard.values = newBoard

			// Redirect to base page
			http.Redirect(w, req, "/", http.StatusTemporaryRedirect)

		} else {
			// if this is the first time visiting the page, make a new board
			if globalBoard.values == nil {
				globalBoard.values = makeNewBoard()
			}

			// If the page is just refreshed or redirected from newGame,
			//	serve the existing board
			w.Header().Set("New Game", "False")
			w.Header().Set("Content-Type", "text/html; charset=utf-8")
			w.WriteHeader(200)
			tpl.ExecuteTemplate(w, "index.html", globalBoard.values)
		}
		return
	}

	// POST will be used when the client slides the board pieces
	// if the method is post, pull out body and check which direction to slide the tiles
	if req.Method == "POST" {

		// decode JSON
		decoder := json.NewDecoder(req.Body)

		var reqBod requestBody

		// Try to decode
		// TODO use some logging and gracefully redirect on failure
		err := decoder.Decode(&reqBod)
		if err != nil {
			panic(err)
		}

		//log.Println("direction: ", reqBod.Direction)

		// reconstruct the board
		newBoard := reconstructBoard(reqBod.Values)

		// set up an array to send back in response
		responseArray := make([]int, 0)

		// Check for direction
		// Process the board
		if reqBod.Direction == "right" {

			// call slide right function
			// process Board collapsed the rows, it is build to work as a slide right
			processBoard(&newBoard)
		}

		if reqBod.Direction == "up" {
			// to process Up, the 4x4 matrix must be rotated so that it can be passed
			// to the processBoard function

			// rotate 90
			rotateClockwise(&newBoard)

			// call slide right
			processBoard(&newBoard)

			// rotate back 90
			rotateCounterClockwise(&newBoard)
			//fmt.Println("after counter rotation: ", newBoard)
		}

		if reqBod.Direction == "down" {

			// to process down, first rotate CC wise
			rotateCounterClockwise(&newBoard)

			// process slide right
			processBoard(&newBoard)

			// rotate back
			rotateClockwise(&newBoard)
			//fmt.Println("after counter rotation: ", newBoard)
		}

		if reqBod.Direction == "left" {

			// left processing requires two rotations
			rotateCounterClockwise(&newBoard)
			rotateCounterClockwise(&newBoard)

			//Process the board
			processBoard(&newBoard)

			//fmt.Println("before counter rotated board: ", newBoard)

			// Rotate back
			rotateClockwise(&newBoard)
			rotateClockwise(&newBoard)

			//fmt.Println("after counter rotation: ", newBoard)
		}

		//once board processing is done, we need to write it response

		//assign globalBoard so it can be reserved if page is refreshed
		globalBoard.values = newBoard

		// build up a response array
		for i := range newBoard {
			responseArray = append(responseArray, newBoard[i]...)
		}

		// convet to JSON
		respBod, err := json.Marshal(responseArray)

		//log.Println("respBod: ", string(respBod))

		// TODO Handle error
		if err != nil {
			log.Println("error in json marshall")
		}

		//Set headers and write response
		w.Header().Set("Content-Type", "application/json")
		w.WriteHeader(http.StatusOK)
		fmt.Fprint(w, string(respBod))
		return
	}
	return
}

// This function will be used by http handler to pass the board values to the
//	process function
func processBoard(board *[][]int) {
	for i, v := range *board {
		(*board)[i] = processRow(v)
		//responseArray = append(responseArray, newBoard[i]...)
	}

}

// This function is used to reconstruct a 2D slice from a 1D slice retrieved from http requests
func reconstructBoard(values []string) [][]int {
	newBoard := make([][]int, 4)
	for i := 0; i < 4; i++ {
		newBoard[i] = make([]int, 0)
		//fmt.Println(i)
		for j := (4 * i); j < (i*4 + 4); j++ {
			//fmt.Println("j: ", j)
			currentVal, _ := strconv.Atoi(values[j])
			newBoard[i] = append(newBoard[i], currentVal)
		}
	}
	return newBoard
}

// Build a new 4x4 board (2D slice)
func makeNewBoard() [][]int {
	board := make([][]int, 4)
	for i := 0; i < 4; i++ {
		board[i] = make([]int, 4)
		for j := 0; j < 4; j++ {
			board[i][j] = rand.Intn(4)
		}
	}
	//fmt.Println("borad", board)
	return board
}

// this function will rotate the matrix by 90 CW
func rotateClockwise(values *[][]int) {
	//toReturn := make([]int, 0)
	l := len(*values)
	//fmt.Println("len: ", l)
	for i := 0; i < (l / 2); i++ {
		for j := i; j < (l - i - 1); j++ {
			tmp := (*values)[i][j]

			//[0][0] = [3][0]
			(*values)[i][j] = (*values)[l-1-j][i]

			//change [3][0] = [3][3]
			(*values)[l-1-j][i] = (*values)[l-1-i][l-1-j]

			// [3][3] = [0][3]
			(*values)[l-1-i][l-1-j] = (*values)[j][l-1-i]

			// [0][3] = tmp
			(*values)[j][l-1-i] = tmp

			// (*values)[l-1-i][l-1-j] =

			// (*values)[l-1-j][i] = tmp

		}
	}
}

// this function will rotate the matrix by 90 CCW
func rotateCounterClockwise(values *[][]int) {
	//toReturn := make([]int, 0)
	l := len(*values)
	//fmt.Println("len: ", l)
	for i := 0; i < (l / 2); i++ {
		for j := i; j < (l - i - 1); j++ {
			tmp := (*values)[i][j]

			(*values)[i][j] = (*values)[j][l-1-i]

			(*values)[j][l-1-i] = (*values)[l-1-i][l-1-j]

			(*values)[l-1-i][l-1-j] = (*values)[l-1-j][i]

			(*values)[l-1-j][i] = tmp
		}
	}
}

// make global var for our pointer to template
var tpl *template.Template

// call init func to parse all templates
func init() {
	tpl = template.Must(template.ParseFiles(("static/index.html")))

}

func main() {

	// set seed for random num generator
	rand.Seed(time.Now().UTC().UnixNano())

	// define handler func for "/"
	http.HandleFunc("/", indexHandler)

	//load static files
	http.Handle("/scripts/", http.StripPrefix("/scripts/", http.FileServer(http.Dir("static/scripts"))))

	http.Handle("/static/", http.StripPrefix("/static/", http.FileServer(http.Dir("static/"))))

	// Start server -- listen at localhost, port 8080
	log.Fatal(http.ListenAndServe(":8080", nil))
}
