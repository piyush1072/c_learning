 import java.util.Scanner;
// import java.io.*;
//import java.lang.*;
import java.util.*;
 class sorting 
{  
    public static int[] sort(int arr[],int n){
        for (int i = 0; i < n; i++)   
        {  
    for (int j = i + 1; j < n; j++)   
    {  
        int tmp = 0;  
        if (arr[i] > arr[j])   
            {  
        tmp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = tmp;  
    }  
    }   
   // System.out.println("The sorted array elements are"+arr[i]);  
    } 
    return arr;
    }
public static void main(String[] args)   
{   
    int[] arr = new int[50];
    int n;System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        arr=sort(arr,n);
        System.out.print("The sorted array elements are"+Arrays.toString(arr));
         //System.out.println("Array after sorting /n"+ Arrays.toString(newarr));


    }  
}  