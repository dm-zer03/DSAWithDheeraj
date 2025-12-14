
public class AssignmentOperators {

    public static void main(String[] args) {
        // = 
        int a = 10;
        int b = a;
        System.out.println("b:" + b);

        // +=  A=A+10 => A+=10
        // a = a + 10; //20
        a += 10; //Execution will fast
        System.out.println(a);

        // -=  A=A-10 => A-=10
        a -= 10;
        System.out.println(a);

        // *=
        a *= 10;
        System.out.println(a);

        // /=
        a /= 10;
        System.out.println(a);

        // %=
        a %= 10;
        System.out.println(a);
    }
}
