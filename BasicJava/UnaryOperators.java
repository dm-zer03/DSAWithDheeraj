
public class UnaryOperators {

    public static void main(String[] args) {
        System.out.println("========Pre-Increment==========");
        int a = 10;
        int b = ++a;
        System.out.println(a); // a is incremented before assignment, so a and b both are 11
        System.out.println(b);

        System.out.println("========Post-Increment==========");
        int c = 10;
        int d = c++;
        System.out.println(c); // c is incremented after assignment, so c is 11 and d is 10
        System.out.println(d);

        System.out.println("========Pre-decrement==========");
        int e = 10;
        int f = --e;
        System.out.println(e); // e is decremented before assignment, so e and f both are 9
        System.out.println(f);

        System.out.println("========Post-decrement==========");
        int g = 10;
        int h = g--;
        System.out.println(g); // g is decremented after assignment, so g is 9 and h is 10
        System.out.println(h);
    }
}
