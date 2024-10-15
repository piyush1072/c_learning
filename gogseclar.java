import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
class gogseclar{
    public static int seclar(int arr[])//11,11,11,1
    {
        int res=-1;
        int largest=0;
        for (int i=1; i < arr.length;i++)
        {
            if(arr[i]>arr[largest])//arr[1]>arr[0],arr[2]>arr[1],arr[3]>arr[2]
            {
                res=largest;
                largest=i;
            }
            else if(arr[i]!=arr[largest])
            {
                if(res==-1||arr[i]>arr[res])
                res=i;
            }
        }
        return res;
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
        int i;

        
         int lar = seclar(arr);
         System.out.println(" "+lar);
    }

}