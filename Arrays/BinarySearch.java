// Prerequisite array should be in sorted order may be in 
// ascending or descending 
// Why return -1 ? if values not found 
// In arrays -1 index does not exist thats why 
// TC : O(log n)

public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            //if at mid index key found then return mid index
            if (numbers[mid] == key) {
                return mid;
            }
            // if mid val is less then  search for right 
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                // if mid val is greater then search for left 
                end = mid - 1;
            }
        }
        // after running the whole loop still does not found element then return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int key = 15;

        System.out.println("The number found at index :" + binarySearch(numbers, key));

    }
}
