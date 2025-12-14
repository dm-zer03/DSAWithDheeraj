
import java.util.*;

public class TernaryOpr {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your number ");
            int num = sc.nextInt();
            String noType = (num % 2 == 1) ? "Odd" : "even";

            System.out.println("noType: " + noType);
        }
    }
}
