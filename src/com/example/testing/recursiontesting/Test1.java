package src.com.example.testing.recursiontesting;

public class Test1 {

    public static void foo(int n, int sum) {
        int k = 0, j = 0;
        if (n == 0) {
            return;
        }

        k = n % 10;
        j = n / 10;
        sum = sum + k;
        foo(j, sum);
        System.out.println(k);
    }

    public static int fun(int n) {
        int x = 1, k;
        if (n == 1) return x;
        for (k = 1; k < n; ++k)
            x = x + fun(k) * fun(n - k);
        return x;
    }

    public static int d = 1;

    public static void count(int n) {

        System.out.println(d);
        System.out.println(n);

        d++;
        if (n > 1) {
            count(n - 1);
        }

        System.out.println(d);
    }

    public static void main(String[] args) {
        int a = 2048, sum = 0;

        count(3);

//        int z = fun(5);
//        System.out.println(z);
//        foo(a, sum);
//        System.out.println(sum);
    }
}
