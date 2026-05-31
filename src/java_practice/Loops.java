public class Loops {
    public static void main(String[] args) {
        int n = 4;
        star(n);
    }
        // code for Ascending order of '*'.[print after recursion
        static void star(int n) {
            if (n == 0) {
                return;
            }

            star(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");

            }
            System.out.print(" ");
            System.out.print("\n");
        }

    }

