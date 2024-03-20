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
    
    
    for(i=1;i<n;i++){
    	int current=arr[i];
    	int j=i-1;
    	while(arr[j]>current && j>=0){
    		arr[j+1]=arr[j];
    	j--;
		}
		arr[j+1]=current;
    	
	}
    
    
    
		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
