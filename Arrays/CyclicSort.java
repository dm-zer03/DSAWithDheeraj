
import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int crctIdx = arr[i] - 1;
            if (arr[i] != arr[crctIdx]) {
                swap(arr, i, crctIdx);
            } else {
                i++;
            }
        }
    }

    public static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
