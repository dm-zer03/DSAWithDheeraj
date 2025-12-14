
import java.util.*;

public class TDArrays {

    public static boolean findKeyIn2Darr(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];
        int r = matrix.length;
        int c = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix element:");

        //For rows 0 to n rows
        for (int i = 0; i < r; i++) {
            //For cols 0 to n cols
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        // System.out.println("Matrix :");
        // for (int i = 0; i < r; i++) {
        //     for (int j = 0; j < c; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // findKeyIn2Darr(matrix, 1);
        System.out.println("Ans:" + findKeyIn2Darr(matrix, 1));
    }

}
