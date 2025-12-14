
import java.util.*;

public class ItCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income ...");
        int income = sc.nextInt();

        int tax = 0;

        if (income < 500000) {
            System.out.println("No Need To Pay Tax ....");
        } else if (income > 500000 && income < 1000000) {
            tax = (int) (income * 0.2);

        } else {

            tax = (int) (income * 0.3);

        }
        //Calling Globally to Save Line Of Code ...
        System.out.println("Tax:" + tax);
    }
}
