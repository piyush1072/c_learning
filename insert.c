#include<stdio.h>
#include<conio.h>
int main()
{
	int x,i,n,arr[50],pos,num;
	printf("Enter the no. of elements in array ");
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
	printf("enter the element to insert ");
	scanf("%d",&num);
	printf("enter the position ");
	scanf("%d",&pos);
	
//	if(pos<0||pos>n+1){
//		printf("invalid ");
//	}
//	else{
//		for(i=n-1;i>=pos-1;i--){
//			arr[i+1]=arr[i];
//		}
//		arr[pos-1]=num;
//		n++;
//	}
    if(pos<=0||pos>n){
    	printf("invalid ");	
	}
	else{
		for(i=pos-1;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		n--;
	}
		for(i=0;i<n;i++)
	{
		printf("\narr[%d]=",i);
		printf("%d\n",arr[i]);
	}
	
	
	return 0;
}
