import java.util.Scanner;
class gogestock{
    public static int max_profit(int arr[],int n)//1,5,3,8,12
    {
        int profit = 0;
        for(int i = 1; i < n; i++)
        {
            if(arr[i]>arr[i-1])
            {
                profit+=(arr[i]-arr[i-1]);
            }
        }
        return profit;
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
        int temp=max_profit(arr,n);
        System.out.println(temp);
    }

}