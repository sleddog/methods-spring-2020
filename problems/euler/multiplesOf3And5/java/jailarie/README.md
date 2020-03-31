#Multiples of 3 and 5

https://projecteuler.net/problem=1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

##Solution
Loop through each number from 1 to 999. If the number can be divided by 3 or 5 with a remainder of 0 add it to the sum.

##Running the Program
Open the Java IDE of your choice. (If you do not have a java IDE installed Eclipse can be downloaded for free. Open eulerProblemOne.java in your IDE and run as Java application. Solution will be printed to the console.

##Unit Test
Open eulerProblemOneTest.java in your Java ide and run as JUnit. The test will assert the correct answer for the user input of 10, which is 23.
