# Project Euler problem #1, Multiples of 3 & 5

## Logan Pappas github.com/lpappas98

### Solution

The solution to this problem was relatively easy. For the example given from numbers 1 through 9 if you add the multiples of 3 & 5 together then you get 23 as their sum. If you expand this problem from multiples of 3 & 5 to 1-99 then you need to make a loop that runs from 1 to 99 and each time you have a multiple of 3 & 5 which you can tell if the modulus is 0 then you add that to an integer called sum. At the end of the loop you print out the sum and it is the correct answer!

### Setup
Since the solution to this problem was made using JAVA you will need to install the latest version of java to run this program. You can download Java at https://www.java.com/en/. You have multiple options of an IDE to use to run this code, I personally used netbeans but you can also use intelliJ or eclipse, whatever is your favorite!

### Run the code
 To run this code you will want to open the solution driver file and then run it using whatever IDE you choose.

### Testing
For the unit testing of this problem i changed the driver slightly to add in the capability to test easier by comparing the value of the solution to the value of what is expected based on an input that the user chooses. For the test I have it set to 10 so it would compare the answer of 23 to what the actual driver comes back with which is also 23.
