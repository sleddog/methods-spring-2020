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
            
              int totalSum = solution(); 
              System.out.println("The total sum of all multiples of 3 & 5 is " + totalSum);

	}
    
    public static int solution(){
        int totalSum=0;
        
        for(int i=0;i<100;i++){
            if(i%3 == 0| i%5 == 0){
                totalSum+=i;
            }
        }
        return totalSum;
    }    
    
}
