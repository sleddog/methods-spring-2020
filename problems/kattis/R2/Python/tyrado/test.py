import unittest

from r2l import calculate
# import calculate

def test_calculate():
    i = input(10)
    j = input(20)
    output = calculate(i,j)
    assert output == 30

# def test_calculate()
#   i = 6
#   j = 8
#   output = calculate(i, j)
#   asset output == 15