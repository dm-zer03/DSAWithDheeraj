
import java.util.Arrays;

// Create an array then iterate backward and then copy to 
// New array then it will be easy but TC:O(n),SC:O(n) which is not good options 
//Best way do changes in that array with SC:O(1)=> No extra Space
// Variable takes Const space => 2 var =>O(2) which is negligible
// TC: O(n/2)==O(n)
public class ReverseArr {

    public static void reverseArr(int numbers[]) {
        // Access the array index and swap 
        int start = 0, end = numbers.length - 1;
        while (start < end) {

            //Swap
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;

        }

    }

    public static void main(String[] args) {
        int numbers[] = {25, 88, 99, 44, 77};
        reverseArr(numbers); //Pass By REFERENCE 
        System.out.println(Arrays.toString(numbers));
    }
}
