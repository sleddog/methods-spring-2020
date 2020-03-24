# No Duplicates
https://open.kattis.com/problems/nodup

There is a game in which you try not to repeat a word while your opponent tries to see if you have repeated one.

"THE RAIN IN SPAIN" has no repeats.
"IN THE RAIN AND THE SNOW" repeats THE.
"THE RAIN IN SPAIN IN THE PLAIN" repeats THE and IN.

Write a program to test a phrase wether is has a repeated word or not.

## Input
Input is a line containing words separated by single spaces, where a word consists of one or more uppercase letters. A line contains no more than 80 characters.

## Output
The output is "yes" if no word is repeated, and "no" if one or more words repeat.

## Solution
Limiting the user's input to 80 characters (including spaces). Then, taking the user's and appending every string separated by a space into a list. Comparing the list to itself after making it a set then a list.

If they are equal then it means there are no duplicate words. Otherwise there are duplicates.

Note: a set is a similar data type to a list, but it has no duplicate elements.


## Installation
Recommended Python 3.4+
https://www.python.org/downloads/


## How to run
```
$ python3 NoDuplicates.py
```
use 'py' instead of 'python3' if you are using Windows.
or you can open and run the script in Visual Studio Code with the interpreter configured correctly.

You could also use IDE such as PyCharm.
