
public class Pattern {

    public static void main(String args[]) {

        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* * ");
        // System.out.println("* ");
        //Type Promotion in Java -> Only with Expressions
        char a = 'a';
        char b = 'b';
        // char c =b-a; Error Type promotion 
        System.out.println((int) b);//98
        System.out.println((int) a);//97
        System.out.println(a);//a
        System.out.println(b);//b
        System.out.println(b - a);//1
        System.out.println(98 - 97);//1

        //-----------------------------------------------------//
        short e = 5;
        byte f = 25;
        char g = 'c';
        byte bt = (byte) (e + f + g); //lossy conversion from int to byte
        System.out.println(bt);
    }
}
