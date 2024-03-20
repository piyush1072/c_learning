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
	
	int counter=1;
	while(counter<n-1){
		for(i=0;i<n-counter;i++){
			if(arr[i]>arr[i+1]){
				x=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=x;
			}
		}
		counter++;
	}
	
	

		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
