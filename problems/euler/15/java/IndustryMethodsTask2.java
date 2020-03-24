/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package industrymethodstask2;
import java.util.Scanner;
/**
 *
 * @author Owen Serviss
 */
public class IndustryMethodsTask2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The path count for a 20x20 grid is:");
        System.out.println(pathfinder(20,20));
        Scanner input = new Scanner(System.in);
        System.out.println("This works for any input. Provide 2 inputs:");
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        System.out.println(pathfinder(input1,input2));
    }
    public static long pathfinder(int x, int y){
        int a = x+1;
        int b = y+1;
        //long a b since lattice paths follow number of edges, not dimension
        long[][] arr;
        arr = new long[a][b];
        //nested loops to iterate through the array
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(j == 0 || i == 0){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                    //adds values directly left and directly above
                    //this gives the number of routes to that point
                }
            }
        }
        return arr[x][y];
    }
}
