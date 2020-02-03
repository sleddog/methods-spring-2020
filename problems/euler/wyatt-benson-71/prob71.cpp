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
		while((iter->next != NULL) && (temp->val > iter->val)){iter = iter->next;}
		temp->next = iter->next;
		iter->next = temp;
		temp->prev = iter;
		if(iter->next != NULL){iter->next->prev = temp;}
	}
	else{
		temp->next = (*head);
		(*head) = temp;
	}
}
void printF(struct node* head){
	do{
		cout << head->val << ", ";
		head = head->next;
	}while(head != NULL);
	cout << "\n";
}
void printR(struct node* head){
	while(head->next != NULL){head = head->next;}
	do{
		cout << head->val << ", ";
		head = head->prev;
	}while(head != NULL);
}
int main(){
	struct node* head = NULL;
	insert(&head,1,2);
	insert(&head,3,4);
	printF(head);
}
