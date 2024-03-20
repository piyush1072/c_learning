#include<stdio.h>
#include<conio.h>

int binarysearch(int arr[],int n,int key){
		int s=0;
	int e=n;
	while(s<=e){
		int mid =(s+e)/2;
		if(arr[mid]==key){
			return mid;		
		}
		else if(arr[mid]>key){
			e=mid-1;
		}
		else{
			s=mid+1;
		}
	}
	
	return -1;
	
}








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
	int key;
		printf("the no. you want to search");	
		scanf("%d",&key);
	
	int index =binarysearch(arr,n,key);

	
	printf("the no. is %d at %d",key,index);
		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
