Project Euler problem #1, Multiples of 3 and 5 below 1000

Gabe Ewsuk github.com/gabeewsuk

Solution-------
This problem was solved using a while loop. I started by defining x and total, my variables, to be zero. 
Then I go on to use a while loop that will run for every value of x that is below 1000.
In the loop, I use and if statement to say if x modulus 3 is equal to zero then add x to the total.
Next, I create an elif statement for the x modulus 5 equal to zero. if this is true x will be added to the total.
The last part of the while statement is adding 1 to x every time it loops.
Lastly, the answer, total, is printed. 
In this case, it is all of the multiples of 3 and 5 below 1000.


Prerequisites-----
Python 3 will be required in your system path to run this code.
No libraries are needed to run this program. Possibly vi if you want to copy this into your own .py document.

Running the code----
This code can easily be run from the command line once the projecteuler1.py is downloaded or copied into vi.
 To run the program type 'python3 projecteuler1.py' and press enter.

Running the unit test----
This code has the unit test built in so the answer will be checked just after it is printed. If it is stated
as OK then the answer is correct and ready for merging.



