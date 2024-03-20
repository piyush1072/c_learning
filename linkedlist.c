#include<stdio.h>
#include<stdlib.h>

struct Node {
	int data;
	struct Node * next;
};


//case 1

struct Node* insertatfirst(struct Node * head,int data){
	struct Node* ptr=(struct Node*)malloc(sizeof(struct Node));
	ptr->next = head;
	ptr->data = data;
	return ptr;
}

//case 2

struct Node* insertatindex(struct Node * head,int data,int index){
	struct Node* ptr=(struct Node*)malloc(sizeof(struct Node));
	struct Node* p=head;
	int i=0;
	while(i!=index-1)
	{
		p=p->next;
		i++;
	}
	ptr->data=data;
}








void linkedlisttraversal(struct Node * ptr){
	while(ptr !=NULL)
	{
		printf("Element: %d\n",ptr->data);
		ptr = ptr->next;
	}
}

int main()
{
	struct Node *head;
	struct Node *second;
	struct Node *third;
	struct Node *fourth;
	
	head=(struct Node *)malloc(sizeof(struct Node));
	second=(struct Node *)malloc(sizeof(struct Node));
	third=(struct Node *)malloc(sizeof(struct Node));
	fourth=(struct Node *)malloc(sizeof(struct Node));
	
	
	head->data=7;
	head->next = second;
	second->data=11;
	second->next = third;
	third->data=41;
	third->next = fourth;
	fourth->data=66;
	fourth->next = NULL;
	printf("The linked list before insertion\n");
	linkedlisttraversal(head);
	head = insertatfirst(head,56);
	printf("The linked list after insertion\n");
	linkedlisttraversal(head);
	return 0;
}
