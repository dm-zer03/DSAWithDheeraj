
public class Reverse {

    public static void main(String[] args) {
        int lastDigit = 0;
        int n = 30797;
        int rev = 0;
        while (n != 0) {
            lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.print("Rev of number  :" + rev);
    }
}
