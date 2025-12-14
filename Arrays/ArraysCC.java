
import java.util.*;

public class ArraysCC {

    public static void main(String[] args) {
        // By defining size 
        int marks[] = new int[5];
        // Java automatically  detect it has 3 fixed size 
        // int numbers[] = {22, 55, 66};
        // int moreNumbers[] = {77, 88, 99};
        // String fruits[] = {"Apple", "Mango", "Orange"};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the Array Elements ");
            marks[i] = sc.nextInt();
            System.out.println("Array elements filled : " + i);
            // System.out.println("Array elements filled : " + marks);//Address 
            System.out.println("Array elements filled : " + Arrays.toString(marks));//Print the actual arrays

        }

        System.out.println("Arrays Length  :" + marks.length);

        // System.out.println("Enter the Array Elements ");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // marks[3] = sc.nextInt();
        // System.out.println("marks[0] :" + marks[0]);
        // System.out.println("marks[1] :" + marks[1]);
        // System.out.println("marks[2] :" + marks[2]);
        // System.out.println("marks[3] :" + marks[3]);
    }
}
