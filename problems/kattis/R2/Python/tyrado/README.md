

I also did another problem in case this is not sufficient which was the r2.
 https://open.kattis.com/problems/r2 In this one you take in two numbers and get out the mean. 
 so you input S and R1 but you dont know what R2 is so i wrote a program that made it compute this S=(R1+R2)/2.
 To do this I took R2=((S*2)-R1). 
 To do this I scanned in the values and then had them be within a range from -1000 - 1000. 
 Then I got in my values R2 and S and then did the math and returned them as 1 answer. 
 unfortunatly for some reason it will not allow me to add this one.
 But if you find this one to not meet the test you are wanting to do I will add it here. 
 It works much better when you open and run it with visual studio code. 
 https://code.visualstudio.com/
 When you download visual studio code make sure you also download all of the python packages to do that. There are bars on the side there is an extention tab look for them.
I had to completly redo my function because writing a test code for it was a learning proccess. So in my code I made sure that it checked the input was a integer 
before it errors out. 
My unit test test_r2l.py you have to have your files names the exact same for it to work. The test_r2l.py and r2l.py should be in the same folder.
Once that condition has been meet then in the terminal for whatever thing you are running run the command pytest. 
This should then show that the test has run and it all works.
This should look just like the photo.
