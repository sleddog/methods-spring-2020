/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 public class Driver {

     /**
      * @param args the command line arguments
      */

     public static void main(String[] args) {
               //Make an int that will store the solution with an input of 1000 then print it
               int totalSum = solution(1000);
               System.out.println("The total sum of all multiples of 3 & 5 is " + totalSum);

 	}
     //Method that takes in an int and then determines the multiples of 3 & 5 and adds them all together to whatever the input is
     public static int solution(int test_number){
         int totalSum=0;
         for(int i=0;i<test_number;i++){
             if(i%3 == 0| i%5 == 0){
                 totalSum+=i;
             }
         }
         return totalSum;
     }

 }
