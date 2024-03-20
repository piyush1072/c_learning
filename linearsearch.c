#include<stdio.h>
#include<conio.h>

int linearSearch(int arr[],int n,int key,int i){
	for(i=0;i<n;i++){
		if(arr[i]==key){
		return i;	
		}
	}
	return -1;
}





int main()
{
	int x,i,n,arr[50],pos,key,index;
	printf("Enter the no. of elements in array");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	//	printf("arr[%d]=\n",i);	
		scanf("%d",&arr[i]);
	}
	
	
	printf("enter the no. to find");
	scanf("%d",&key);
	
	
	 index = linearSearch(arr ,n ,key ,i);
	
printf("the %d is found at %d",key,index);
		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
