package src.com.example.recursion;

public class SumOfN {

    public static int fastestMethod(int n) {
        return n * (n + 1) / 2;

        //this will take time complexity if = o(1)
        // because this is uses as constant of formula which is fastest so it's faster
    }

    public static int lessFastestMethod(int n) {
        int i, s = 0;

        for (i = 1; i <= n; i++) {
            s += i;
        }
        return s;

        /*

        this function is using time complexity is := 0(n)
        because s+= i is taken order of n time
        and rest of taken 1 time
        and for formula taken n+1
        so timecomplexity is 0(n)

         */
    }

    public static int recursiveCallingMethod(int n) {
        if (n == 0) {
            return 0;
        } else {
            return recursiveCallingMethod(n - 1) + n;
        }

        /*
            it's take a as compare to other call it's take more space
            because everytime new activation record of create of recursiveCallingMethod(n)
            so it's take more stack

            space complexity is o(n)
            time complexity is o(n)
         */
    }

    public static void main(String[] args) {
        int i = fastestMethod(8);
        int z = lessFastestMethod(8);
        System.out.println(i);
        System.out.println(z);
    }
}
