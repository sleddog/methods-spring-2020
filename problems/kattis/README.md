# Bozeman-Bridger Simulation Using Threads

CSCI 460
Assignment #1 - Concurrency, Fall 2019
Chris Major, Montana State University

## Overview

This program is to crate a simulation of traffic across a one-lane bridge, using the pthreads library. All code files are in the /code folder.

This project was developed in a Vagrant VM environment, using the "unbuntu/trusty64" box.

## Build
To build this program, use the following in the Bash command line:

```bash
	gcc -std=c99 csci_460_assingment_1.c -o a_1 -lpthread
```
	
Or use the Makefile by typing:

```bash
	make
```

To run the program, type:

```bash
	./a_1 [NUMBER OF CARS TO SIMULATE] [MAX NUMBER OF CARS ALLOWED ON BRIDGE]
```
	
In the event that an input command is not provided, a default value will be created. Please note that, to ensure safe functionality on nearly any machine, a maximum car limit of 100 is set as a constant in the program.

## Testing Details
Testing was conducted for a default case of 10 cars and a bridge maximum of 5. Please see the example output files "output_sample_1.txt", "output_sample_2.txt", and "output_sample_3.txt" in the /code directory for examples of the running simulation. 

Essentially, if a green success message printed for each and every car that entered the simulation, the experiment was considered successful - with no crashes, deadlock, or starvation. The intermediate messages in cyan indicate the car's status relative to the bridge. The yellow messages indicate a car waiting to drive across the bridge. Messages in red indicate errors in the program.