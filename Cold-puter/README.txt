PROJECT TITLE: Cold-puter

The cold-puter is a helpful program to count the number of below zero days in a month. Living in a baren wasteland like Montana you may wonder how long has this hell gone on? Cold-puter is here to help. 

GETTING STARTED

INSTALLING

PREREQUISITES: LINUX DISTRO
	       PYTHON 3 

In this guide we are going to assume that you are working in a Linux environment, because most of the course work is in Linux. 

Lucky for us alot of modern Linux distros ship with python installed! But lets make sure we're updated and upgraded.
Step 1 Update and Upgrade
 
Run the:

$ sudo apt update

and

$ sudo apt -y upgrade

Then confirm(yes) the installation if prompted to do so.

Step 2 Check version of Python

type this command to check your version of Python

$ python3 -V

You'll recieve output similar to the following, depending on what version and what opdates you've done.

Output: Python 3.6.7

Our simple Python code doesn't need any other packages to run so we're all done!

If your version of Linux didn't come with Python installed do the following:
Start updating the packages list and installing the prerequisites:

$ sudo apt update
$ sudo apt install software-properties-common

Next, add the deadsnakes PPA to your sources list:

$ sudo add-apt-repository ppa:deadsnakes/ppa

When prompted press Enter to continue:

Once the repository is endabled, install Python 3.7 with:

$ sudo apt install python3.7

verify by this command

$ python3.7 --version

You should see this output:

Python 3.7.3

Great you're ready to go! 


GETTING AND RUNNING THE CODE

I belive it is safe to assume if you're reading this, you already know how to get code from the class repo. Its the most likely route you came by this text.

But for completeness sake here's how to get it if you're reading this on the web. 

Now that we're sure Python is ready to rock on your machine, we need to get the files from the sleddog repo. 

First cd into the root of the local repository where your git files are cloned to. This should be the "methods-spring-2020" 

Second checkout the branch containing the Cold-puter files using the $ git checkout -b "choose name of new branch" this will give you your own branch of of the code to work with. 

Once you have the files its time to run them and count up those cold days! 

Cold-puter requires the user to give it input in the form of text files.
Cold-puter already comes with two example files:

cold-001.in
cold-002.in

Cold-puter activates by using the follwing command

$ python Cold-puter.py -i cold-001.in

Cold-puter will then give the following output:

Inputfile is cold-001.in
Sub-zero days this month: 1

TESTING YOUR OWN FILES

Files need to be in the following format

Top line - number of days computed
second line - list of days separated by a space

""""""""""""""""""""""""""""""""""""""""""""""""""""
6
-14 -5 -12 101 -15 74


""""""""""""""""""""""""""""""""""""""""""""""""""""  

files also need to be in the same folder as Cold-puter:
methods-spring2020/"YourBranch"/Cold-puter$ ls
Cold-puter.py README.txt cold-001.in cold-002.in "new_test_file.in" 

AUTHORS

Blake Stanger 

LICENCE

There is no licence on the Cold-puter.  Go now, take my code! You may ruin it in anyway you see fit. Have fun!   

    

