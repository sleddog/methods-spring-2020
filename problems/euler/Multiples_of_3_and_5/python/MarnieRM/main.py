#2/3/2020 Marnie M Problem 1
class Main:
    @staticmethod  # Can be called without needing to create a main object
    def main():
        countUp = 0  # Keeps track of how close under 1000 the running sum of a given number is
        sumTotal = 0  # tallies up the total of 3s and 5s under 1000

        while countUp + 3 < 1000:  # Counts how many 3s there are under 1000
            countUp += 3
            sumTotal += countUp  # countUp holds the current largest multiple of 3 and adds it to the total sum
        countUp = 0

        while countUp + 5 < 1000:  # Counts how many 5s there are under 1000
            countUp += 5
            sumTotal += countUp
        countUp = 0

        while countUp + 15 < 1000:  # Counts how many 15s are under 1000 to get rid of repeats
            countUp += 15
            sumTotal -= countUp

        print("The sum of all the multiples of 3 or 5 below 1000 is:")  # Prints the answer
        print(sumTotal)


if __name__ == "__main__":  # Runs the program if the file is called from command line
    Main.main()