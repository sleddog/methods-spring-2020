import random

def generation(file_name):
    infile = open(file_name, 'r')
    first = infile.readline()
    x = random.randint(1,560)
    z = 0
    for line in infile:
        z += 1
        cells = line.split(',')
        if z == x:
            break
    name = cells[0]
    print(name)
generation('/Users/mrfur/Desktop/494/env/namesfixed.csv')