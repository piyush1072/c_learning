//Sort a given array from all sorting methods .Also mention what is the time complexity of each method. and which is the best sorting techninqe.
import java.util.Scanner;
import java.lang.*;
class notion6{
    public static void main(String args[]){
        int[] arr = new int[50];
    int n;
    System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Bubblesort(arr,n);

        Selectionsort(arr,n);

        Insertionsort(arr,n);

        MergeSort(arr,0,n-1,n);

    }

    //printing array
    public static void printarray(int arr[],int n){

        for (int i = 0; i < n; i++){
            System.out.print("\n"+arr[i]);
        }

    }

    //bubble sort T.C=n^2
    public static void Bubblesort(int arr[],int n){
        System.out.print("\nThe sorted array elements are :");
        for (int i = 0; i < n; i++)   //n times
        {  
    for (int j = i + 1; j < n; j++)   //n times
    {  
        int tmp = 0;  
        if (arr[i] > arr[j])   
            {  
        tmp = arr[i];  
        arr[i] = arr[j];  
        arr[j] = tmp;  
    }  
    }   
    //System.out.print("\n"+arr[i]);  
    } 
    printarray(arr,n);
    }

    //selection sort T.C=n^2
    public static void Selectionsort(int arr[],int n){
        System.out.print("\nThe sorted array elements are :");
        for(int i=0; i <n-1; i++){  //4 8 5 2
            int small=i; //s = 0 , 1 , 2
            for(int j=i+1; j<n;j++){  //j = 3,3 < 4  4<4 -- out
                if(arr[small]>arr[j]){  //a[o] > a[3]  4> 2
                    small = j;  //s =  j = 3 j =2
                }
            }
            int temp=arr[small];  //temp = a[3] = 2 
            arr[small]=arr[i];  // a[3] = a[0]  = 4
            arr[i]=temp; //a[0] = 2      ----> a == [2, 8, 5, 4] ---> [ 2 5 8 4]
        }

         printarray(arr,n);
    }



    //insertion sort T.C=n^2
    public static void Insertionsort(int arr[],int n){
        System.out.print("\nThe sorted array elements are :");
        for (int i=1; i<n; i++){
            int current = arr[i];
            int j=i-1;
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
                arr[j+1] = current;

        }

        printarray(arr,n);
    }
    //merge sort T.C=nlogn
    public static void MergeSort(int arr[],int si, int ei,int n){
        if (si>=ei){
            return;
        }
        n=arr.length;
        int mid = si+(ei-si)/2;
        MergeSort(arr,si,ei,n);
        MergeSort(arr,mid+1,ei,n);
        conq(arr,si,mid,ei);
        printarray(arr,n);
    }

    public static void conq(int arr[],int si, int mid,int ei){
        int merged[]=new int [ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1 <= mid && mid+1 <= ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x]=arr[idx1];
                x++;idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;idx2++;
            }
            while(idx1 <= mid){
                merged[x]=arr[idx1];
                x++;idx1++;
            }
            while(mid+1 <= ei){
                merged[x]=arr[idx2];
                x++;idx2++;
            }
            for(int i=0,j=si;i<merged.length;i++,j++){
                arr[j]=merged[i];
            }
        }
        
    }

    //quick sort


}