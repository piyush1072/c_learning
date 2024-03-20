#include<stdio.h>
#include<stdlib.h>
#define MAX 5
int stack_arr[MAX];
int first = -1;

void push(int data)
{
//	if (first==MAX-1)
//	{	printf("Stack overflow");}
  int i;
  first +=1;
  for(i=first;i>0;i--)
  stack_arr[i]=stack_arr[i-1];
  stack_arr[0]=data;	
}
void pop()
{
	int i,value;
	value =stack_arr[0];
	for(i=0;i<first;i++)
	stack_arr[i] = stack_arr[i+1];
	first -=1;
	printf("the element to be poped is %d",value);
//	return value;
}
   void peek()
   {
   printf("the top element is %d",stack_arr[0]);	
   }
void print()
{
int i;
if (first == -1)
{
	printf("Stack underflow");
//	exit(1);
}
for(i=0;i<=first;i++)
printf("%d ", stack_arr[i]);
printf("\n");
}

int main()
{
int choice,data,value;
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
		
		switch(choice)
		{
			case 1:
				printf("Enter the element to be pushed");
				scanf("%d",&data);
				push(data);
				break;
				
			case 2:
			pop();
			
		    break;
			
			case 3:
			peek();
			break;
			
			case 4:
			print();
			break;
			
			case 5:
			exit(1);
			break;
			return 0;	
		}		
	}

}
