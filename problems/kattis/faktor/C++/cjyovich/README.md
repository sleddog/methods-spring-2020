## Faktor

[Link to Kattis page](https://open.kattis.com/problems/faktor)

The impact factor of a scientific journal is a measure reflecting the average number of citations to articles published in science journals. For this task we are using a simplified formula for calculating the impact factor:

(Total count of citations received by articles published in the journal)/(Total number of articles published)

Rounding is always performed upwards. For example the impact factor of the “Journal for ore research and time wasting” that published 38 articles cited 894 times is 894/38=23.53 rounding up to 24.

You are the editor of one scientific journal. You know how many articles you are going to publish and the owners are pushing you to reach a specific impact factor. You are wondering how many scientists you will have to bribe to cite your articles to meet the owners demands. Since money is tight you want to bribe the minimal amount of scientists. Each bribed scientist buys you a single citation.

### Solution

Subtract one from the impact factor, multiply by the number of articles, and add one.

### Compile

In command line, navigate to the folder where faktor.cpp is located, then type the command below.
*NOTE: If you don't have a C++ compiler installed, I'd recommend using MinGW.*
 
> g++ -o faktor faktor.cpp

Now faktor can be run as an executable program.

# Known Issue: Since the addition of the unit testing framework, to run faktor in this manner, lines 23 and 24 must be commented out. I am working to resolve this issue but until further notice this is the only way to successfully compile the program when NOT running the unit tests.

### Running the program

The user running the program provides the input. Type in the number of articles and the impact factor with a space between them and hit enter. The program will compute the minimum number of scientists you must bribe to reach the desired impact factor.

### Unit Testing

This program uses Catch, a header-only unit testing feature for C++. You can download Catch [here](https://github.com/catchorg/Catch2). To test the citationsNeeded function, make sure you have the catch.hpp file in the same folder as faktor.cpp. To run the unit test from the command line, navigate to the folder where test_faktor.cpp is located and type the following command:

>g++ -o test test_faktor.cpp

Now "test" can be run as an executable program. The program will prompt you for user input and then print the unit test results.