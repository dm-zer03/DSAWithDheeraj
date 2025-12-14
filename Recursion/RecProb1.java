package Recursion;

// Print numbers from n to 1 (Decreasing Order)
public class RecProb1 {

    //Recursive function
    public static void printInDec(int n) {
        /* will take one extra step
        if (n == 0) {
            return;
        }*/

        // Base Conditions ->W/O this there will br stackFlow Error.
        if (n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printInDec(n - 1);

    }

    public static void printInInc(int n) {
        /* will take one extra step
        if (n == 0) {
            return;
        }*/

        // Base Conditions ->W/O this there will br stackFlow Error.
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printInInc(n - 1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 10;
        // printInDec(10);
        printInInc(n);
    }
}
