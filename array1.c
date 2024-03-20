#include <stdio.h>
#define MAX 4
int stack_arr[MAX];
int top=-1;
int main(){
	int data;
		push(1);
		push(2);
		push(3);
		push(4);
		pop();
		
	}
	int push(int data)
	{
		if(top==MAX-1)
		{
			printf("Stack overflow");
			return;
		}
		top=top+1;
		stack_arr[top]=data;
	}
	int pop ()
	{
		int value;
		if (top==-1)
		{
			printf("Stack underflow");
			return ;
		}
		value = stack_arr[top];
		top = top-1;
		return value;
	}
	void print()
	{
		int i;
		if (top==-1)
		{
			printf("Stack underflow");
			return;
		}
		for(i=top;i>0;i--)
		printf("%d",stack_arr[i]);
		printf("\n");
	}
	

