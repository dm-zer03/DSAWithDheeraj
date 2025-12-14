
public class BiToDec {

    public static void bitToDec(int bitNum) {
        int originalNum = bitNum;
        int pow = 0;
        int decNum = 0;

        while (bitNum != 0) {
            int lastDigit = bitNum % 10;
            decNum += lastDigit * (int) Math.pow(2, pow);
            bitNum /= 10;
            pow++;
        }

        System.out.println("Decimal of " + originalNum + " = " + decNum);
    }

    public static void DecToBin(int n) {
        int originalNum = n;
        int pow = 0;
        int bitNum = 0;

        while (n != 0) {
            int rem = n % 2;
            bitNum += rem * (int) Math.pow(10, pow);
            n /= 2;
            pow++;
        }

        System.out.println("binary of " + originalNum + " = " + bitNum);
    }

    public static void main(String[] args) {
        bitToDec(101);
        DecToBin(5);
    }
}
