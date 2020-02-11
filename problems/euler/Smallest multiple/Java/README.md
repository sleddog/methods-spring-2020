# Smallest multiple
Problem 5 from ProjectEuler.net

## Description
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

## Solution
To find the least common multiple (LCM) of three numbers a, b, c, it is sufficient to find LCM of a and b (call it d) and then find LCM of d and c.

This way, the problem of determining LCM of several numbers may be reduced to LCM of two numbers.

LCM of two number can be in turn found as `LCM(a,b) = ab/GCD(a,b)`, where GCD(a,b) is the greatest common divisor of a and b.

Finally, GCD can be found using Euclidean algorithm.

## Setup
Java VM (any version) must be installed.

## Usage
To run the program, type `java Multiple` from the command line. The result will be shown on console.

To compile the program text, run `javac Multiple.java` from the command line to produce `Multiple.class` file.
