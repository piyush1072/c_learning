import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
class goglar{
    public static int getlar(int arr[])
    {
        int res=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[res])
            res=i;
        }
        int x=arr[res];
        return x;
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

        
         int lar = getlar(arr);
         System.out.println(" "+lar);
    }

}