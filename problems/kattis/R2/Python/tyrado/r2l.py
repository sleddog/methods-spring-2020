def check(i):
    try:
        i = int(i)
        print("Input is an integer number. Number = ", i)
        return i
    except ValueError:    
        try:
            i = float(i)
            print("Input is a float number. Number = ", i)
            return i 
        except ValueError:
            print("No.. input is not a number. It's a string")
            return None

def calculate(i, j):
    k = 0
    i = check(i)
    j = check(j)
    if i <= 1000 and i>= -1000 and j>=-1000 and j<=1000:
        k = j * 2 - i
        return(k)
    else:
        check(i)
        check(j)
    return 'Your number is {k}'

if __name__ == "__main__":
    i = (input("put in your numbers for i: "))
    j = (input("put in number for j: "))
    print(calculate(i, j))