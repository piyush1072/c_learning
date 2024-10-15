import java.util.Scanner;
class check{
    public static boolean insort(int arr[],int n)//10,20,30,40
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1]){//20<10,30<20,40<30
            return false;
            }
        }
        return true;
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
        System.out.println(arr.length);
        System.out.println(n);
        System.out.println(insort(arr,n));
        
        // int lar = insort(arr);
        // System.out.println(" "+lar);
    }

}