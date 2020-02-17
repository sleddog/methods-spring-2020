# Project Euler problem #22, Name Scores

## Dan Bachler github.com/DanielBachler

### Solution

My solution to this problem first reads in values.  The way that hackerrank sets up the problem the first input is a integer with the number of names to follow that is constrained to 1 <= N <= 5200.  Next there are N names input and read into an array of names.  After that a value 1 <= Q <= 100 is read in for the number of names to match to be read in.  Those names are also read in and put into a seperate array.  The list of names is sorted alphabetically, then the names are "scored" by getting the place in the alphabet of each letter in the word and adding them together.  These values are stored in a hash with the names as keys and scores as values.  Finally for all Q names that are being searched for the words are found in the hash and then the final score is calculated and printed.

### Setup

No libraries are needed, the only tools required are Ruby setup in your system path, a code editor of your choice, and a functional command line.  

The other option as listed below is to run this code on hackerrank, then no setup is needed besides copying and pasting the code into the box.

### Run this code

There are two ways that this code can be run, it can be submitted on hackerranks Project Euler competetion and will succesfully
complete the challenge.  Or the values can be manually fed in by running the program in terminal.

To run this code from the command line, ruby version >2.6 must be installed, use command:

```ruby
ruby solution.rb
```