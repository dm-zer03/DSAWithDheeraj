
import java.util.Scanner;

public class BasicString {

    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // In Java, Strings are IMMUTABLE (Old strings cannot change)
        // Always form new Strings and that variable starts pointing towards
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the name:");
        // String name = sc.next();
        // Consume the leftover newline character after sc.next()
        // sc.nextLine();
        // System.out.println("Enter the full name:");
        // String fullName = sc.nextLine();
        // System.out.println("Name: " + name);
        // System.out.println("Full name: " + fullName.length());
        // String Concatenation
        String firstName = "Dheeraj";
        String lastName = "Mishra";

        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);

        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i) + " ");
        }
        System.out.println("");

        sc.close();
    }
}
