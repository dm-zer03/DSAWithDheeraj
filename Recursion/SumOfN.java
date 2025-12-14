package Recursion;

public class SumOfN {

    public static int sum(int n) {
        if (n == 1) {
            return 1;

        }
        int sum = n + sum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
