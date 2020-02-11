def noDup():
    while True:
        words = (input("Enter a sentence:")).upper()
        if len(words) > 80:
            print("The sentence exceeded the limit of 80 characters")
        else:
            break
    wordSplit = words.split()
    if len(list(set(wordSplit))) == len(list(wordSplit)):
        return "Yes"
    else:
        return "No"

print(noDup())