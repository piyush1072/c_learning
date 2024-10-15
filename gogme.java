import java.util.Scanner;
class gogme{
    public static int maxsum(int arr[],int n)
    {
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i =1; i <n; i++)
        {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
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
        int temp=maxsum(arr,n);
        System.out.println(temp);
    }

}