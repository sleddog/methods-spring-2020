import math

total = 1
cont = True

for num in range(2,190):
    if all(num%i!=0 for i in range(2,int(math.sqrt(num))+1)):
       total *= num

sq = math.sqrt(total)
rounded = round(sq)
print(rounded)
while cont == True:
    if total%rounded==0:
        cont = False
    else:
        rounded -= 1
    
print(rounded)


