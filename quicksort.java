class quicksort{

    public static void swap(int[] a, int i, int j)//a,2,2
    {
        int temp = a[i];//t=4||
        a[i] = a[j];//a[0]=1
        a[j] = temp;//a[2]=4
    }

    public static void Quicksort(int[] a,int l,int h)
    {
        if(l<h)
        {
            int pi = partition(a,l,h);
            Quicksort(a,l,pi-1);
            Quicksort(a,pi+1,h);
        }

    }

    public static int partition(int[] a, int l, int h)
    {
        int pivot = a[h];
        int i = (l - 1);

        for (int j = l; j <= h - 1; j++) 
        {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }
        swap(a, i + 1, h);
        return (i + 1);
    } 

    public static void main(String[] args)
    {
        int a[] = {4,1,3,2,10,51,1};
        int n= a.length;
        System.out.print(n);
        Quicksort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
    // System.out.print();
    
   }
}