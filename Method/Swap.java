
public class Swap {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // Commented for call by value example
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // All changes should be limited to only this functions only...
    }

    public static int product(int a, int b) {
        int c = a * b;
        return c;

    }

    public static void main(String[] args) {
        //Swapping the two number
        int a = 10;
        int b = 20;
        // int temp = 0;
        // temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
        // swap('c', 'd');
        //Call by value concept 
        //Swap function create a copy 
        swap(a, b);
        System.out.println("Product: " + product(a, b));

        // below print statement print the original value of a and b 
        // from main method 
        // System.out.println("a: " + a);
        // System.out.println("b: " + b);
    }
}
