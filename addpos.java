import java.util.Scanner;
//import java.io.*;
//import java.lang.*;
import java.util.*;
class addpos {
    public static int[] addElement(int n, int arr[], int ele, int pos) 
    { 
        int i;  
        int newarr[] = new int[n+1]; 
  
     
        for (i = 0; i < n+1; i++)     //10 20 30 40 50 pos=4 ele=70 
        { 
            if (i < pos - 1) 
                newarr[i] = arr[i];  
            else if (i == pos - 1) 
                newarr[i] = ele;         
            else
                newarr[i] = arr[i - 1]; 
        } 
        //System.out.println("The new array is"newarr[i]);
        return newarr; 
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
        int ele,pos,i;
        System.out.println("Enter the position you want to add element");
        pos = sc.nextInt();

        System.out.println("Enter the element");
        ele = sc.nextInt();
        arr = addElement(n,arr,ele,pos);

         System.out.println("\nArray with " + ele + " inserted at position "+ pos + ":\n"+ Arrays.toString(arr));

       /* for(i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=ele;
        n++;
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }*/


      //  addElement(n, arr, ele, pos);
        
    


    }  
}    