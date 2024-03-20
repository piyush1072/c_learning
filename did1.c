#include<stdio.h>
#include<stdlib.h>
int main(){
int a[20],i,j,k,temp,n,num;//pos=0;
printf("Enter the no. of elements");
scanf("%d",&n);
for(i=0;i<n;i++)
scanf("%d",&a[i]);

printf("Enter the no. to be searched ");
scanf("%d",&num);
for(i=0;i<n;i++)

{
	if(a[i]==num)
    {
		printf("%d found at position %d ",num,i+1);
	}

  }
  
  printf("%d not found ",num);
  //return 0;
  
  
  for(i=0;i<n;i++)
  {
  	for(j=i+1;j<n;j++){
  		if(a[i]>a[j])
  		{
	  		temp=a[i];
  		    a[i]=a[j];
  			a[j]=temp;
		  }
	  }
	} 
    printf("Array  elements");
for(i=0;i<n;i++)
{
	printf("%d ",a[i]);
 } 
 return 0;
}
