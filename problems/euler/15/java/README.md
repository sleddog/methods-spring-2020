# Euler Project 15 Owen's Solution
- The task was to write code to find the number of lattice paths along a 20 by 20 grid
- Lattice paths follow the edges, and in those case go from the top left corner, to the bottom right
- One restriction is that paths can never move leftward nor upward
- This is accomplished by making a two dimensional array and filling the first column and row with 1's
- Then adding the element to the left with the element above the current index
- This works since it gives the number of unique paths to that index
- Since I was no reason not to allow user input to find the number of paths through their grid, I made that possible
- Netbeans was the IDE used for this, and the .jar file can be found in the dist folder
>This Markdown was made with DILLINGER, a browser based text editor with a great template