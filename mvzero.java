import java.util.Scanner;
class mvzero{

    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void mvzred(int arr[],int n)
    {
        int count = 0; 
		for (int i = 0; i < n; i++)
        {
			if (arr[i] != 0)
            {
                swap(arr,i,count);
                count++;
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
        mvzred(arr,n);
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
