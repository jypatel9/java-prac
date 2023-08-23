package src.com.example.recursion;

public class FibonacciSeries {

    public static int fib(int n) {
        int t0 = 0, t1 = 1;

        if (n <= 1) {
            return n;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static int[] f = new int[10];

    public static int memoizationFibonacci(int n) {
        if (n <= 1) {
            f[n] = n;
            return n;
        } else {
            if (f[n - 2] == -1) {
                f[n - 2] = memoizationFibonacci(n - 2);
            }

            if (f[n - 1] == -1) {
                f[n - 1] = memoizationFibonacci(n - 1);
            }

            f[n] = f[n - 1] + f[n - 2];
            System.out.println(f[n - 1] + f[n - 2]);

            return f[n - 2] + f[n - 1];
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            f[i] = -1;
        }

        int m = memoizationFibonacci(6);
        System.out.println(m);
    }
}
