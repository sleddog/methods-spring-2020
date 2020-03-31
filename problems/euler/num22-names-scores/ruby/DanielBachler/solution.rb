def problem(names, to_score)
    #Hash of scores without weighting
    scores = Hash.new(0)
    names.each do |word|
        score = 0
        0.upto word.length-1 do |i|
            score += (word[i].ord - 64) 
        end
        scores[word] = score
    end
    # Answer dict
    answers = Hash.new(0)
    to_score.each do |word|
        multiplier = names.find_index(word) + 1
        answers[word] = scores[word] * multiplier
    end
    return answers
end

def main()
    # Enter your code here. Read input from STDIN. Print output to STDOUT
    puts "Please enter the number of names to be entered for list"
    t = gets.strip.to_i
    words = Array.new(t)
    puts "Please enter names:"
    0.upto t-1 do |i|
        words[i] = gets.strip
    end
    puts "Please enter number of names to be scored"
    n = gets.strip.to_i
    toGet = Array.new(n)
    puts "Please enter names to be scored"
    0.upto n-1 do |i|
        toGet[i] = gets.strip 
    end
    #sorted array
    words.sort_by!{|words| words}
    # Call scoring method
    answer = problem(words, toGet)
    # Print answers
    toGet.each do |word|
        puts word + ": " + (answer[word]).to_s
    end
end

#main()