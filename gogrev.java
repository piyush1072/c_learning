import java.util.Scanner;
class gogrev{
    public static void reverse(int arr[],int n)
    {
        int low=0,high=n-1;
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
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
        reverse(arr,n);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        
        // int lar = insort(arr);
        // System.out.println(" "+lar);
    }

}