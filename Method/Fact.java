
import java.util.Scanner;

public class Fact {

    // Helper functions :
    // Small functions use to calculate or to do small task so that 
    // we can reduced our works.
    //By using factorial method 
    public static int calcFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binoCoeff(int n, int r) {
        int binoCoeff;
        if (r > n) {
            return 0;
        }
        int nFact = calcFact(n);
        int rFact = calcFact(r);
        int nMinusRFact = calcFact(n - r);
        binoCoeff = (nFact) / (rFact * nMinusRFact);
        return binoCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        System.out.println("Factorial of the given number: " + calcFact(num));
        System.out.println("Factorial of the given number: " + fact);
        System.out.println("BinoCoeff of the given number: " + binoCoeff(5, 2));
        sc.close();
    }

}
