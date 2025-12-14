
public class WhileLoop {

    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
            // System.out.println("HelloWorld!:" + counter);
            System.out.println(counter);
            counter++;
        }
        // System.out.println(" Printed HelloWorld 100 time");

        while (true) {
            // System.out.println("HelloWorld!");

        }
        // Unreachable Code ... => Due to Always true condition of while loop 
        // System.out.println(" Printed HelloWorld 100 time");
    }
}
