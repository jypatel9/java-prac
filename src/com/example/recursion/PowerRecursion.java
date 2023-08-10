package src.com.example.recursion;

public class PowerRecursion {

    public static int powerRecursive(int m, int n) {
        if (n == 0) {
            return 1;
        } else {
            return powerRecursive(m, n - 1) * m;
        }
    }

    //another way
    /*
    here suppose 2^8 = (2^2)^4 so, it's (2*2)^4
     */

    public static int powerFasterMethod(int m, int n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return powerFasterMethod(m * m, n / 2);
        } else {
            return m * powerFasterMethod(m * m, (n - 1) / 2);
        }
    }

    public static void main(String[] args) {
        int n = powerRecursive(2, 9);
        int z = powerFasterMethod(2, 9);
        System.out.println(n);
        System.out.println("faster method" + z);
    }
}