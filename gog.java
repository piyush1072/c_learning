import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
class gog{
    public static void main(String args[]){

        int[] arr = new int[50];
    int n;
    System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ele,pos,i;
       
        System.out.println("Enter the position you want to add element");
        pos = sc.nextInt();

        System.out.println("Enter the element");
        ele = sc.nextInt();
         n = insert(arr,n,ele,arr.length,pos);
         for( i=0;i<n;i++){
             System.out.println(arr[i]);;
        }
   }

    public static int insert(int arr[],int n,int ele,int cap,int pos){
        if(n==cap)
            return n;
        int idx = pos-1;
        for(int i=n-1;i>=idx;i--)
            arr[i+1]=arr[i];
            arr[idx]=ele;
        return (n+1);    
    }

}