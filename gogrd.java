import java.util.Scanner;
class gogrd{
    public static int remdups(int arr[],int n)
    {
        int res=1;
        for (int i=1;i<n;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
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
        n=remdups(arr,n);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

}