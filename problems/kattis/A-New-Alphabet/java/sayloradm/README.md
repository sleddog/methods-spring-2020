Read me for assignment 2 -

------- Solution Explanation --------

My solution for the problem of "Creating a new language" utilizes a switch
statement to store the values for the new language characters. 

Since all characters that do not have a translation are required to stay the 
same, there is a default case that handles all other characters not included
in the new language.

The user enters a string and the string is sent to a translate method and
split by characters to then be translated.

The translate method uses a switch statement to translate character by 
character and appends the new characters to a new string that contains
the translated sentence. The translate then returns this completed string to 
main and prints it.

------ Local Enviornment --------

First, make sure that java is in the PATH of command line.

Type echo %PATH% and try to locate the JDK file directory

If it is not present, Type "Advance system settings" into the search bar

Once there open environment variables and click edit on the "PATH" section

Find where the JDK is installed, usually something like:
C:\Program Files\Java\jdk-13.0.2\bin

copy that path and paste it into the PATH section of environment.

Close the environment tab and open a new command line.

Lastly, make sure the version numbers are identical:

Type:
 
java -version 

and

javac -version 


If they are not, make sure only one jdk is installed using control panel

------ Running the Code --------

The program can be run through command line using this code:

First, make sure the directory is the same as the java file.

Next,

javac newAlphabet.java

java newAlphabet.java

and add input when prompted to 

---- Running the Unit test ------

First, download the junit.jar and hamcrest-core.jar files from https://github.com/junit-team/junit4/wiki/Download-and-Install

Next, move these two jar files to an easily accessible location on your computer

You should then set the CLASSPATH in command prompt to be able to access these two files

Use: SET CLASSPATH=.;C:\Downloads  (Use the path to your jar files)

In command prompt enter:

javac newAlphabet.java

javac TestFinal.java

java org.junit.runner.JUnitCore TestFinal

The unit test should now run 
