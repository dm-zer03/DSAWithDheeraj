package BitManipulation;

public class BitMap {

    public static void main(String[] args) {
        // Binary And 
        System.out.println((5 & 6)); //4

        //Binary OR
        System.out.println((5 | 6)); //7

        //Binary OR
        System.out.println((5 | 6)); //3

        //Binary NOT
        System.out.println((~5)); //2 but it is O
        System.out.println((~0)); //1 but it is -1

        //Binary Left Shift 
        System.out.println((5 << 2)); //20 : Calc by formula => a*2^b

        //Binary Right Shift 
        System.out.println((6 >> 1)); //12 : Calc by formula => a*2^b

    }
}
