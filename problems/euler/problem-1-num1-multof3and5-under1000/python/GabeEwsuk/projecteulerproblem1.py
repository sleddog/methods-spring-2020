def main():
    x = 0
    total = 0
    while x < 1000:
        if x % 3 == 0:
            total += x

        elif x % 5 == 0:
            total += x
        x+=1
    print(total)
main()

# Code looks good to me, nothing unnecessary is added.  Maybe add some comments to explain the thought process.
# +1