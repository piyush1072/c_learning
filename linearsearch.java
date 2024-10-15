class linearsearch{
    public static void main(String[] args){
        int[] a= {24,5,31,9,2};
        search(a,31);
    }

public static void search(int[] a,int e){
    for(int i=0; i<a.length; i++){
        if(a[i]==e){
            System.out.print("the element was found at "+i+" index");
        }
    }
}

}