import java.util.Scanner;
class goglr{
    public static void lr(int arr[],int n)
    {
        int temp = arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
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
        lr(arr,n);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

}