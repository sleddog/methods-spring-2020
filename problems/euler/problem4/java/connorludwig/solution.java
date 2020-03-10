//By Connor Ludwig

public class Solution {

  public static void main(String[] args) {
      solve();
  }



public static void solve(){
  int max = 0;

  //multipy all number from 100 to 999 together
  for (int i = 999; i >= 100; i--) {
      for (int j = 999; j >= 100; j--) {
          int p = i * j;
          if (max < p && isPalindrome(p)) //passes product from loop into isPalindrome function.
          {
              max = p; //if is a palindrome and greater than the last palindrome, set new max
          }
      }
  }

  if(max ==0){
      System.out.println("No palindrome found");
  }

  else{
      System.out.println(max);
  }
}


  public static boolean isPalindrome(int input) {
      int rev = 0; // will hold the reversed number
      int x = input; //stores initial input to be changed

      //algorithm for determining if number is a palindrome
      while (x > 0) {
          rev = 10 * rev + x % 10;
          x /= 10;
      }

      return input == rev;//returns true if the number is palindrome
  }

}
