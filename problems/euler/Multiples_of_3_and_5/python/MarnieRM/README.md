# Project Euler Problem 1

[Project Euler](https://projecteuler.net/about) is a website for mathematical and computational problems. This is the solution to [problem 1](https://projecteuler.net/problem=1) from their problem archive. This problem asks:

```bash
If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
```

## Installation
This was coded in [Python 3.8](https://www.python.org/downloads/release/python-380/).

Use [command line](https://www.codecademy.com/articles/command-line-setup) to  install python 3.8 if not already installed with the following command:

```bash
sudo apt install python
```

## Calling From The Command Line

For running the program on the command line, run the following in the file folder:

```bash
python main.py
```

## Expected Output

There is no other expected output than this:
```bash
The sum of all the multiples of 3 or 5 below 1000 is:
233168
```

## The Code

The code is essentially variations on the following code:

```python
while countUp + 3 < 1000:
    countUp += 3
    sumTotal += countUp
```
Where coutUp counts up to 1000 so that you only count up to 1000 and sumTotal keeps track of the total sum of all the multiples of 3 or 5.

## Support
Please contact for help or issues:

Marnie M: roisin.m.manning@gmail.com

## License
[GPL3](https://www.gnu.org/licenses/gpl-3.0.en.html)
