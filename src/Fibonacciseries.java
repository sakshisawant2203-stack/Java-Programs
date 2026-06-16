public class Fibonacciseries {
    public static void main(String[] args) {
        // Print element at index n of fibonacci series.
        // Fibonacci series = 0,1,1,2,3,5,8,13,21,34.
      int n=9;
        int result = Fibonacciseries.fib(n);
     System.out.println("The nth term of fibonacci is:" + result);
}
    static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

}





