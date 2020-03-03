
def r2():
    i=(int( input("put in your numbers for i: ")))
    j=(int(input("put in number for j: ")))

    print("This is I's value",i , "This is J's value",j)
    
    if i <= 1000 and i>= -1000 and j>=-1000 and j<=1000:
        k =  0 
        k=((j*2)-i)
        print("k's value",k);
        #j= (i+k)/2
     
    else:
        pass 
    #return(k)
    #print(k)
     
            
r2()