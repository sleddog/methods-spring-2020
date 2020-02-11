
public class eulerProblemOne {
	public static void main(String[] args) {
		int n = 1000;
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
