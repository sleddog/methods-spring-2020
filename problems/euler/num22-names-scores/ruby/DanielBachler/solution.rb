# Enter your code here. Read input from STDIN. Print output to STDOUT
t = gets.strip.to_i
words = Array.new(t)
0.upto t-1 do |i|
    words[i] = gets.strip
end
n = gets.strip.to_i
toGet = Array.new(n)
0.upto n-1 do |i|
    toGet[i] = gets.strip 
end
#sorted array
words.sort_by!{|words| words}
#Hash of scores without weighting
scores = Hash.new(0)
words.each do |word|
    score = 0
    0.upto word.length-1 do |i|
        score += (word[i].ord - 64) 
    end
    scores[word] = score
end
toGet.each do |word|
    multiplier = words.find_index(word) + 1
    puts scores[word] * multiplier
end