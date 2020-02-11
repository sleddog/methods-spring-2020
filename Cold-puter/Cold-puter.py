import sys, getopt


def main(argv):
    #read in input file
    inputfile = ''
    try:
        opts, args = getopt.getopt(argv, "hi:o", ["ifile=", "ofile="])

        #exception for errors
    except getopt.GetoptError:
        print('Cold-puter.py -i <inputfile>')
        sys.exit(2)
    for opt, arg in opts:
        if opt == '-h':
            print('test.py -i <inputfile> -o')
            sys.exit()
        elif opt in ("-i", "--ifile"):
            inputfile = arg
    print("Input file is "), inputfile

    # opens and parses subzero days.
    with open(inputfile) as fileobj:
        vg = fileobj.readline().rstrip('\n')
        c = fileobj.readline().rstrip('\n')
        x = c.split(' ')
        g = 0

    for i in range(0, int(vg)):
        p = int(x[i])
        if p < 0:
            g = g + 1

    fileobj.close()
    print("Sub-zero days this month: "), g


if __name__ == "__main__":
    main(sys.argv[1:])
