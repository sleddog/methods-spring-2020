
**************************Industry Methods Assignment 2****************************

Author: Ben Barnett



_____________________________________________Description____________________________________

This is the Friendly Interactive SHell problem from Kattis.
Yo It’s terminal based, but a bit friendlier to new users who can’t remember the commands they typed before. 
Fish can use your history of commands for command completion:
pressing up (“^”) finds the last command you ran.

If you press up again you go another step back in time, finding the second last 
command that you entered
If there are no more matching commands you stay at the oldest matching command.

When a series of consecutive up-presses is ended, either by typing some other character or 
by pressing enter to run the current command, 
the matching command from the history replaces everything that was typed in the current input.

Pulled from https://open.kattis.com/problems/fish




_________________________________________Running and Using__________________________________

To use it you just run the Main.java file, 
insert how many commands you're going to be using, 
and then the commands themselves.
 
They whole point of the SHell is that when you insert a "^" charachter and it will autofill 
that ^ charachter with the command that was used as many lines ago as the number of ^'s you put down.

To run the program, run the main method in the Main.java file.

first you will input the number of commands you're going to be entering
then youll enter the commands themselves, with "^"'s where you want to refrence previous commands
to exit enter "exit at the start of the program cycle"


Example usage:

Enter number of commands that will be entered, then enter the commands
-------------------------enter exit to quit-----------------------

IN: 3
OUT: 3

IN: you
OUT: you

IN: hello
OUT: hello

IN: hey ^^
OUT: hey you




_____________________________________________Unit Tests_____________________________________

I used to JUint for "thorough" testing of this program.

to run these tests download the MainTest.java, MainTestRunner.java, junit-4.13.jar, and hamcrest-core-1.3.jar files 
from the repository, and put them in the same directory as the Main.java file.

navigate to the directory you saved them to and execute the following commands:

compile all the all the files with this command:
javac -cp junit-4.13.jar;. Main.java MainTest.java MainTestRunner.java

then run them with this one:
java -cp junit-4.13.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore MainTest

The output may not make much sense, but it the tests essentially test four cases:
- the input Of a Caret Should Return Previous Cmd
- the input of Too Many Carets Returns the First Cmd
- remove a String If its Connected To a Carret
- keep a String If its Not Connected To a Carret

you can see from the text in the terminal which test is which and what inputs give what outputs.



