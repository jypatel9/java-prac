package src.com.example.recursion;

public class NestedRecursion {

    public static int fun1(int n){
        if (n>100){
            return n-10;
        }
        else
            return fun1(fun1(n+11));
    }

    public static void main(String[] args) {
        int r = fun1(30);
        System.out.println(r);
    }
}
