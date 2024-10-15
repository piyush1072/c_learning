import java.util.Scanner;
class gognstock{
    public static int max_profit(int arr[],int start,int end)
    {
        if(end<=start)
        return 0;
        int profit = 0;
        for(int i = start; i < end; i++)
        {
            for(int j = i+1; j <end; j++ )
            {
                if(arr[j]>arr[i])
                {
                    int cur_profit=arr[j]-arr[i]+max_profit(arr,0,i-1)+max_profit(arr,j+1,end);
                    profit=Math.max(profit,cur_profit);
                }
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
        int temp=max_profit(arr,0,n);
        System.out.println(temp);
    }

}