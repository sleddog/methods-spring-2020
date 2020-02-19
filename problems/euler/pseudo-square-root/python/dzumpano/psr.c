#include <stdio.h>
#include <math.h>
#include <stdbool.h>

int prime(){
    int low = 2, high = 190, i, flag, t = 1;
    while (low < high) {
        flag = 0;
        // if low is a non-prime number, flag will be 1
        for (i = 2; i <= low / 2; ++i) {
            if (low % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0){
	    t *= low;
	}
        ++low;
    }
    return t;
}
int calc(int t){
	int total = t;
	bool cont = true;
	double sq = sqrt(total);
	int rounded = round(sq);
	while(cont == true){
		if(total % rounded==0){
			cont = false;
		}
		else{
			rounded += 1;
		}
	}
}


void main(){
	int t = prime();
	int result = calc(t);
	printf("%i is the pseudo square root", result);
}


