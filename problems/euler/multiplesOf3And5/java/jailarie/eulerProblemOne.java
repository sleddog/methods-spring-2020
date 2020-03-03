import java.util.Scanner;

//Jamie Winter

//Solution to Euler problem one, multiples of 3 and 5.
//https://projecteuler.net/problem=1

public class eulerProblemOne {
	public static void main(String[] args) {
		System.out.println("Please enter a positive number: ");
		Scanner consoleScanner = new Scanner(System.in);
		int n = consoleScanner.nextInt();
		int current = 0;
		int sum = 0;
		
		while( current < n) {
			if(current % 3 == 0 || current % 5 == 0) {
				sum += current;
			}
			current++;
		}System.out.println("The sum of multiples of 3 and 5 below " + n + " is " + sum);
	}	
}
