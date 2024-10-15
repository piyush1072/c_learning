import java.util.Scanner;
class gogtrw {

    public static int getwater(int arr[],int n)//3,0,1,2,5
    {
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0]=arr[0];//lmax[0]=3
        for (int i = 1;i<n;i++)
        lmax[i] = Math.max(arr[i],lmax[i-1]);//(3,3,3,5)
        rmax[n-1]=arr[n-1];//rmax[4]=5
        for (int i=n-2;i>=0;i--)
        rmax[i] = Math.max(arr[i],rmax[i+1]);//(5,5,5,5)
        for (int i = 1;i<n-1;i++)
        res = res + (Math.min(lmax[i],rmax[i])-arr[i]);//3-0=3//3+3-1=5//5+3-2=6  //
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
        int temp=getwater(arr,n);
        System.out.println(temp);
    }

}