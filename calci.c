#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
int main()
{
int choice,a,b;
	while(1)
	{
		printf("\n");
		printf("1. Add two no.\n");
		printf("2. Subtract between two no.\n");
		printf("3. Multiply two no.\n");	
		printf("4. Divison of two no.\n");
		printf("5. Quit\n");
		printf("Please enter your choice : ");
		scanf("%d",&choice);
		
		switch(choice)
		{
			case 1:
				printf("\nEnter 1st no. : ");
				scanf("%d",&a);
				printf("\nEnter 2nd no. : ");
				scanf("%d",&b);
				printf("\nThe addition of two no. is : %d",a+b);
			break;
				
			case 2:
				printf("Enter 1st no. : ");
				scanf("%d",&a);
				printf("Enter 2nd no. : ");
				scanf("%d",&b);
				printf("The subtraction of two no. is %d : ",a-b);
			break;
			
			case 3:
				printf("Enter 1st no. : ");
				scanf("%d",&a);
				printf("Enter 2nd no. : ");
				scanf("%d",&b);
				printf("The multiplication of two no. is %d : ",a*b);
			break;
			
			case 4:
				printf("Enter 1st no. : ");
				scanf("%d",&a);
				printf("Enter 2nd no. : ");
				scanf("%d",&b);
				printf("The divison of two no. is %d : ",a/b);
			break;
			
			case 5:
			exit(1);
			break;
			return 0;	
		}		
	}

}
