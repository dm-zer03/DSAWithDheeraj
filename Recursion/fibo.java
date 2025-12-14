package Recursion;

public class fibo {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        System.out.println(fibo(24));
        System.out.println(fibo(25));
        System.out.println(fibo(26));
        System.out.println(fibo(27));
        System.out.println(fibo(28));

    }
}
