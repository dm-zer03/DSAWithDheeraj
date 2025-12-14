
public class HalfPyramid {

    public static void main(String[] args) {
        int n = 4;
        for (int l = 1; l <= n; l++) {
            for (int num = 1; num <= l; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
