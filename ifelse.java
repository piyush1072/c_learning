class ifelse {
    public static void main(String args[]) {
        int n = 21;
        int a = n%2;
        /*if (a==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
            String result = (a=0) ? ("even") : ("odd");
        }*/
         String result;
         result = (a==0) ? "even" : "odd";
         System.out.println(result);
    }
}