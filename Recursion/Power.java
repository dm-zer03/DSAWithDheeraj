package Recursion;

public class Power {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1=power(x,n-1);
        // int xn=x*xnm1;
        // return xn;

        return x * power(x, n - 1);
    }

    public static int optimisedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        // Stilql TC : O(n)? (n/2+n/2)
        //int halfPowerSq = optimisedPower(a, n / 2) * optimisedPower(a, n / 2);

        //TC:O(logn)
        int halfPower = optimisedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;

    }

    public static void main(String[] args) {
        //System.out.println(power(2, 10));
        System.out.println(optimisedPower(2, 10));
    }
}
