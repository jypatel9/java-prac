package src.com.example.recursion;

public class IndirectRecursion {

    public static void fun1(int n){
        if (n>0){
            System.out.println(n);
            fun2(n-1);
        }
    }

    public static void fun2(int n){
        if (n>1){
            System.out.println(n);
            fun1(n/2);
        }
    }

    public static void main(String[] args) {
        fun1(20);
    }
}
