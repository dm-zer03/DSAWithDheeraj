package Method;

public class NoRtnOverload {
    // int => long
    // float => double

    // function overloading happens only with parameter 
    // Not with return type 
    //Example : Same method name with different parameter 
    // But return type is different CTE 
    /*
    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(int a, int b) {
        return a + b;
    }*/
    public static int sum(int a, int b) {
        return a + b;
    }

    // function overloading with parameter 
    public static float sum(float a, float b) {
        return a + b;
    }

    // function overloading with datatypes 
    public static float sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        sum(11, 12);
        sum(22.03f, 55.12f);
    }
}
