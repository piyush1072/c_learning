 import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
 class rempos{
 public static int[] remElement(int[] arr, int index,int n) 
    { 
      //  int n;
        // Scanner sc = new Scanner(System.in);
       // n = sc.nextInt();
        if (arr == null || index < 0|| index >= n) { 
  
            return arr; 
        } 
  
        int[] anotherArray = new int[n - 1]; 
  //10 20 30 40 index=3
        for (int i = 0, k = 0; i < n; i++) { 
            if (i == index) {     //0!=3   3==3
                continue;        //40 continue loop out
            } 
 
            anotherArray[k++] = arr[i]; //10=10
        } 
        return anotherArray; 
    }


    public static void main(String[] args)   
{   
    int[] arr = new int[50];
    int n;
    System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index,i;
        System.out.println("Enter the index you want to remove element");
        index = sc.nextInt();

        arr = remElement(arr,index,n);

         System.out.println("\nArray after deletion at position "+ index + ":\n"+ Arrays.toString(arr));
        
    }  


 }