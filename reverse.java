import java.util.Scanner;
class reverse{
    public static void main(String args[]){
        int a[]=new int[50];
        int b[]=new int[50];
        int n;
        System.out.println("Enter the no. of elements");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

       /* for(int i=n;i>0;i--){
            b[i]=a[i];
        }*/
        for(int i=n-1;i>=0;--i){
            System.out.print(a[i]+" ");   
        
        }
        
    }    

}