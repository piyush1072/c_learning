import java.util.Scanner;
class didi{
    public static void ldr(int[] arr,int n)
    {
        int cur_ldr=arr[n-1];
        System.out.println(cur_ldr);
        for(int i=n-2;i>=0;i--)
        {
            if(cur_ldr<arr[i])
            {
                cur_ldr=arr[i];
                System.out.println(cur_ldr);
            }
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
        ldr(arr,n);
    }

}