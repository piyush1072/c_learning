#include<stdio.h>
#include<stdlib.h>
int main()
{
	int arr[50],n,i,j,k,num,temp;
	printf("Enter the no of elements:");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("arr[%d]=",i+1);
	    scanf("%d",&arr[i]);
	   
	}
	
		printf("enter the elements to be searched:");
		scanf("%d",&num);
	for(i=0;i<n;i++)
	{
		if(arr[i]==num)
		
		{
		
		
			printf("the %d is found at %d",num,i+1);
        }
		 }
			
			
			
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
	printf("\nAraay elements:");
	for(i=0;i<n;i++)
	{
		printf("\narr[%d]=%d",i+1,arr[i]);
		}	
		return 0;
		
		
		
}
