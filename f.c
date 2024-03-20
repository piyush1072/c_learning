#include<stdio.h>
#include<conio.h>
int main()
{
	int x,i,n,arr[50],pos;
	printf("Enter the no. of elements in array");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	//	printf("arr[%d]=\n",i);	
		scanf("%d",&arr[i]);
	}

		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
