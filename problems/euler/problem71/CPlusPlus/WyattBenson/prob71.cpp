#include <iostream>
#include <bits/stdc++.h>
#include <string>
using namespace std;

struct node{
	int num;
	int denom;
	float val;

	struct node*  next;

	void setVal(){
		val = (float)(num)/(float)(denom);
	}
};
void insert(struct node** head, int n, int d){
	struct node* iter = (*head);
	struct node* temp = (struct node*) malloc(sizeof(struct node));
	temp->num = n;
	temp->denom = d;
	temp->setVal();
	if((*head) != NULL){
		if(temp->val < (*head)->val){
			temp->next = (*head);
			(*head) = temp;
		}
		else{
			while((iter->next != NULL) && (temp->val > iter->next->val)){iter = iter->next;}
			if(iter->val != temp->val){
				temp->next = iter->next;
				iter->next = temp;;
			}
		}
	}
	else{
		temp->next = (*head);
		(*head) = temp;
	}
}
void solve(struct node* iter){
	float num = (float)(3)/(float)(7);
	while((iter->next->val != num) && (iter->next != NULL)){iter = iter->next;}
	cout << "Answer is " << iter->num << "/" << iter->denom << "\n";
}
void generate(struct node** head, int mult,float ans){
	float exempt;
	float percent;
	for(int i=1;i<(mult+1);i++){
		percent = 100 * ((float)(i)/(float)(mult));
		cout << fixed << setprecision(2) << "%" << percent << "\r";
		for(int j=1; j<i;j++){
			exempt = (float)(j)/(float)(i);
			if(exempt <= ans){
				insert(head,j,i);
			}
		}
	}
	cout << "\n";
}
int interpret(int argc, char** argv, int* mult, float* ans){
	if(argc < 3){
		cout << "Not enough arguments, requires 2\n";
		return 0; 
	}
	else if(argc > 3){
		cout << "Too many arguments, requires 2\n";
		return 0;
	}
	else{
		string temp;
		temp = argv[1];
		for(int i=0;i<temp.length();i++){
			(*mult) = ((*mult) * 10) + (temp.at(i) - '0');
		}
		temp = argv[2];
		int num = temp.at(0) - '0';
		int denom = temp.at(2) - '0';
		(*ans) = (float)(num)/(float)(denom);
		return 1;
	}
}
int main(int argc, char** argv){
	struct node* head = NULL;
	float ans;
	int mult = 0;
	int boolean;
	boolean = interpret(argc, argv, &mult, &ans);
	if(boolean == 1){
		generate(&head,mult,ans);
		solve(head);
	}
	return 0;
}
