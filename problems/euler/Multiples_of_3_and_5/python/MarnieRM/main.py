# 2/18/2020 Marnie M Problem 1
class Main:
    @staticmethod  # Can be called without needing to create a main object
    # This function keeps track of the total sum of multiples of 3 and 5 under 1000 in sumTotal
    # and subtracts the sum of the multiples of 15 so there are no repeats.
    def threeAndFive():
        countUp = 0
        sumTotal = 0

        while countUp + 3 < 1000:
            countUp += 3
            sumTotal += countUp  # countUp holds the current largest multiple of 3 and adds it to the total sum
        countUp = 0

        while countUp + 5 < 1000:
            countUp += 5
            sumTotal += countUp
        countUp = 0

        while countUp + 15 < 1000:
            countUp += 15
            sumTotal -= countUp

        print("The sum of all the multiples of 3 or 5 below 1000 is:")
        print(sumTotal)


if __name__ == "__main__":  # Runs the program if the file is called from command line
    Main.threeAndFive()
