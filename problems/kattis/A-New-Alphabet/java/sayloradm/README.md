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

Ensure java is in the PATH of command line:

Type java -version 
and
javac -version 

and make sure the version numbers are identical. 

If they are not, make sure only one jdk is installed using control panel

Next make sure that java is in the PATH of command line.

Type echo %PATH% and try to locate the JDK file directory

If it is not present, Type "Advance system settings" into the search bar

Once there open environment variables and click edit on the "PATH" section

Find where the JDK is installed, usually something like:
C:\Program Files\Java\jdk-13.0.2\bin

copy that path and paste it into the PATH section of environment.

Close the environment tab and open a new command line.

------ Running the Code --------

The program can be run through command line using this code:

First, make sure the directory is the same as the java file.

Next,

javac newAlphabet.java

java newAlphabet.java

and add input when prompted to 