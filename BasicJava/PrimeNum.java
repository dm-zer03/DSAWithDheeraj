
import java.util.*;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                // n is multiple of i (i not equal to 1 and n45)
                if (n % i == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == false) {
                System.out.println("Not A Prime Number...");
            } else {
                System.out.println("Prime Number...");
            }
        }
        //     System.out.println("========NormalWay===========");

        //     int count = 0;
        //     if (n < 2) {
        //         System.out.println("Number is not a Prime Number: " + n);
        //         return;
        //     }
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             count++;
        //             break;
        //         }
        //     }
        //     if (count == 0) {
        //         System.out.println("Number is a Prime Number: " + n);
        //     } else {
        //         System.out.println("Number is not a Prime Number: " + n);
        //     }
        // }
        sc.close();
    }
}
