#include <iostream>
using namespace std;

struct node{
	int num;
	int denom;
	float val;

	struct node*  next;
	struct node*  prev;

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
			(*head)->prev = temp;
			(*head) = temp;
		}
		else{
			while((iter->next != NULL) && (temp->val > iter->val)){iter = iter->next;}
			temp->next = iter->next;
			iter->next = temp;
			temp->prev = iter;
			if(iter->next != NULL){iter->next->prev = temp;}
		}
	}
	else{
		temp->next = (*head);
		(*head) = temp;
	}
}
void printF(struct node* head){
	do{
		cout << head->num << "/" << head->denom << ", ";
		head = head->next;
	}while(head != NULL);
	cout << "\n";
}
void solve(struct node* iter, struct node** ans){
	float num = (float)(3)/(float)(7);
	while((iter->val != num) && (iter->next != NULL)){iter = iter->next;}
	(*ans) = iter->prev->prev;
}
void generate(struct node** head, int mult){
	for(int i=1;i<(mult+1);i++){
		for(int j=1; j<i;j++){
			insert(head,j,i);
		}
	}
}
int main(){
	struct node* head = NULL;
	generate(&head,8);
	struct node* ans = head;
	solve(head,&ans);
	cout << ans->num << "/" << ans->denom << "\n";
}
