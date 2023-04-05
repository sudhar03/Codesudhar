public class Noofpossibilities {
    public static void main(String[] args) {
        // int n = 10;
        // for (int i = 0; i < n; i++) {
        // System.out.println(fibo(i));
        // }
        // int sum = fiboo(4);
        // System.out.println(sum);
        int n = 7;
        if (isperfectsquare(5 * n * n + 4) || (isperfectsquare(5 * n * n - 4))) {
            System.out.println("it is fibo number");
        } else {
            System.out.println("it is not a fibo number");
        }
        // isperfectsquare(49);
    }

    public static boolean isperfectsquare(int n) {
        int sum = (int) Math.sqrt(n);
        if (sum * sum == n) {
            return true;
        }
        return false;

    }

    private static int fiboo(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return fiboo(n - 3) + fiboo(n - 2) + fiboo(n - 1);
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return n;

        } else if (n == 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
