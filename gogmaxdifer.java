import java.util.Scanner;
class gogmaxdifer{
    public static int maxdif(int arr[],int n)
    {
        int res= arr[1] - arr[0];
        int minval = arr[0];
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,arr[i]-minval);
            minval=Math.min(minval,arr[0]);
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
        int gd=maxdif(arr,n);
        System.out.println(gd);
    }
}