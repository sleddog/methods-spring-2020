Code for finding the answer to number 4 of project euler

The problem reads as:
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.


Solution:
I solved this problem by first creating a nested for-loop to multiply every number from 100 to 999 together.
I then took each output of that that for-loop multiplication and passed it to a helper function that contained
the algorithm for determining if a number was a palindrome, if it was it returned true.
And if a certain number returned that it was indeed a palindrome and it was larger than the last palindrome found, it was set as the solution variable I named "max".
Once all numbers where multiplied and checked, the "max" variable was printed and that is the answer.

Setup:
In order to run this code you have must Java installed on your machine.


Running the code:


1. Open terminal or command prompt.
2. Make sure you an in correct directory that holds the java file.
3. Type "javac Solution.java" and hit enter. ("Solution" must be capitalized)
4. Type "java solution" and hit enter
5. The program should output the solution.
