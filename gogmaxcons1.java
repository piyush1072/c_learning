import java.util.Scanner;
class gogmaxcons1{
    public static int maco1(int arr[],int n)
    {
        int res = 0;
        int curr = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                curr = 0;
            }
            else
            {
                curr++;
                res = Math.max(curr,res);
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
        int temp=maco1(arr,n);
        System.out.println(temp);
    }
}