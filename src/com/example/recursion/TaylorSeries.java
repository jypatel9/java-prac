package src.com.example.recursion;

public class TaylorSeries {

    public static double p = 1, f = 1;

    public static double e(int x, int n) {
        double r;

        if (n == 0) {
            return 1;
        }

        r = e(x, n - 1);
        p = p * x;
        f = f * n;
        return r + p / f;
    }

    public static double fasterWay(int x, int n) {
        if (n == 0) {
            return p;
        }
        p = 1 + x * p / n;
        return fasterWay(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(e(4, 10));
        System.out.println("faster way : " + fasterWay(1, 10));
    }
}
