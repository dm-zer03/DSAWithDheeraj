
import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 4");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Sandwitch");
                break;
            case 3:
                System.out.println("Spegetti");
                break;
            case 4:
                System.out.println("Spinach");
                break;

            default:
                System.out.println("Not available...");
        }
        sc.close();
    }
}
