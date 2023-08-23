package src.com.example.recursion;

public class NCRRecursion {

    /*
    the topic is combination formula also called is selection formula

    if the set of object are given to us then how many ways we select the subsect of ways

    ex. :- alphabets given to us and i want only 3 alphabets then how many ways i select any three of them

       :- A B C D E F H
       select : ABC || ABD || ACB (this is wrong because same is first one) so it's interchangeing permutation it's not allowed
       so this are formula know is NCR

       equation :- nCr = n! / r!(n-r)!

       5c = 5C0 5C1 5C2 .... 5C5

       we can also use the pascal triangle for find the value of nCr



     */

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        } else return fact(n - 1) * n;
    }

    public static int nCr(int n, int r) {
        int num, den;

        num = fact(n);
        den = fact(r) * fact(n - r);
        return num / den;
    }

    public static int c(int n, int r) {
        int t1, t2, t3;

        if (r == 0 || n == r) {
            return 1;
        } else {
            return c(n - 1, r - 1) + c(n - 1, r);
        }

    }

    public static void main(String[] args) {
        int z = nCr(5, 2);
        System.out.println(z);
    }

}
