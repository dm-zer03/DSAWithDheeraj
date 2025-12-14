
import java.util.*;

// Use for to get out of Loop 
public class Break {

    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 4) {
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Out of the loop...");

        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter the Number ...");
                int n = sc.nextInt();

                if (n % 10 == 0) {
                    break;
                }
                System.out.println(n);
            } while (true);
            System.out.println("Out of the loop...");
        }
    }

}
