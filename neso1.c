#include<stdio.h>
#define MAX 5
int stack_arr[MAX];
int top = -1;
int main()
void push(int data)
{
	if(isfull)
	{
		printf("Stack overflow");
	return;
	}
	top=top+1;
	stack_arr[top]=data;
}
int isfull(){
if(top==MAX-1)
	return 1;
	else
	return 0;
	
}



int isempty(){
if(top==-1)
	return 1;
	else
	return 0;
	
}
	
int pop()
{
	int value;
	if (isempty)
	{
		printf("stack underflow");
		return;
	}
	value=stack_arr[top];
	top=top-1;
	return value;
}
int peek() {
	if (isempty())
	{
		printf("stack underflow");
		exit();
	}
	return stack_arr[top];
}
void print()
{
	int i;
	if (top==-1)
	{
		printf("Stack underflow");
		return;
	}
	for(i=top;i>=0;i--)
	printf("%d",stack_arr[i]);
	printf("\n");
}
int main(){
	int choice,data;
	while(1)
	{
		printf("\n");
		printf("1. Push\n");
		printf("2. Pop\n");
		printf("3. Print top element\n");	
		printf("4. Print all the element of stack\n");
		printf("5. Quit\n");
		printf("Please enter your choice");
		scanf("%d",&choice);
		
		switch(choice){
			case 1:
				printf("Enter the element to be pushed");
				scanf("%d",&data);
				push(data)
		}		
	}
}

