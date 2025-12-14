
public class PrimeNum {

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        // if (n < 2) {
        //     return isPrime = false;
        // }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                // break; valid 
                return isPrime; // Both are valid 
            }
        }
        return isPrime;

    }

    // optimise method 
    public static boolean isPrimeOpt(int n) {
        // Corner cases : like n=1 
        if (n == 1) {
            System.out.println("Not to be checked it is No:1");
            return false;
        }

        if (n == 2) {
            return true;
            // if this condition is true then no code will execute
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    // By using the helper function
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // System.out.println(isPrime(8));
        // System.out.println(isPrimeOpt(1));
        primeInRange(20);

    }
}
