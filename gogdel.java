import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
class gogdel{
    public static int delete(int arr[],int n,int x)
    {
        int i=0;
        for (i=0;i<n;i++)
        {
            if(arr[i]==x)
            break;
        }

        if(i==n)
        return n;

        for(int j=i;j<n-1;j++)
        {
            arr[j]=arr[j+1];
        }

        return (n-1);    

    }

    public static void main (String[] args)
    {

        int[] arr = new int[50];
    int n;
    System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele,i;

        System.out.println("Enter the element you want to remove");
        ele = sc.nextInt();
        System.out.println("Array after deletion");
         n = delete(arr,n,ele);
         for( i=0;i<n;i++){
             System.out.println(arr[i]);
        }
   
    }
}