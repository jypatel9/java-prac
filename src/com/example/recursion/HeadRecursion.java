package src.com.example.recursion;

public class HeadRecursion {

    public static void fun1(int n) {
        if (n > 0) {
            fun1(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        System.out.println("hello world!!");
        fun1(5);
    }
}
