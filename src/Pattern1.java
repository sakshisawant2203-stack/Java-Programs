public class Pattern1 {
    public static void main(String[] args) {
        /* Write a function to print the following pattern using Recursion.
         *
         **
         ***
         ****
         */
     int n =4;
        Pattern(n);
            }
    static void Pattern(int n){
    if(n>0){
        Pattern(n-1);
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}





