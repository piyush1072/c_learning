import java.util.Scanner;
class goglrd{
    public static void lrd(int[] arr,int n,int d)
    {
        int temp[]=new int[d];
        for (int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for (int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
            arr[n-d+i]=temp[i];
        }
    }

    public static void lrdb(int[] arr,int n,  int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int arr[],int low,int high)
    {
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
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
        int ch ;
        System.out.println("Enter the no. by you want to rotate");
        int d = sc.nextInt();
        System.out.println("Enter your choice");
        ch = sc.nextInt();

switch (ch) 
    {
        case 1:
        lrd(arr,n,d);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        break;
        case 2:
        lrdb(arr,n,d);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        break;
        default:
        System.out.println("Invalid");
        break;
    }

        
        
    }

}