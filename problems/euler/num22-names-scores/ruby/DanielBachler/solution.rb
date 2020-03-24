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
    puts word + ": " + (scores[word] * multiplier).to_s
end