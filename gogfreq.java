import java.util.Scanner;
class gogfreq{
    public static void printfreq(int arr[],int n)
    {
        int freq=1;
        int i=1;
        while(i<n)
        {
            while(i<n && arr[i]==arr[i-1])
            {
                freq++;
                i++;
            }
            System.out.print(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2])
        {
            System.out.print(arr[n-1]+" "+ 1);
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
        printfreq(arr,n);
    }

}
