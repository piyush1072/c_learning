#include<stdio.h>
#include<conio.h>
int main()
{
	int x,i,j,n,arr[50],pos;
	printf("Enter the no. of elements in array");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	//	printf("arr[%d]=\n",i);	
		scanf("%d",&arr[i]);
	}

    for(i=0;i<n-1;i++){
    	for(j=i+1;j<n;j++){
    		if(arr[j]<arr[i]){
    			x=arr[j];
    			arr[j]=arr[i];
    			arr[i]=x;
			}
		}
	}

		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	

	return 0;
}
