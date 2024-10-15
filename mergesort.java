class mergesort{

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
            int pivot = partition(a,l,h);
            Quicksort(a,l,pivot-1);
            Quicksort(a,pivot ,h);
        }

    }

    public static int partition(int[] a,int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(a[i] <= pivot)
            i++;
            while(a[j] > pivot)
            j--;
            if(i<j)
            {
                swap(a,i,j);
            }
        }
        swap(a,i,l);
        return  i;
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
    /* quicksorttest
       public static int partition(int[] a,int l,int h)
    {
        int pivot=a[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(a[i] <= pivot)
            i++;
            while(a[j] > pivot)
            j--;
            if(i<j)
            {
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return  j;
    } */
    
