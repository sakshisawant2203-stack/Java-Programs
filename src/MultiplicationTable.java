public class MultiplicationTable {
    public static void main(String[] args) {
        // multiplication table using method.
        MultiplicationTable.mul(4);
    }

    static void mul(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d", n, i, n * i);
            System.out.println(" ");

        }

    }
}