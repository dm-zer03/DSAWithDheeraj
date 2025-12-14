
public class Solution {

    public static void main(String[] args) {
        int arr[] = {0, 3, 5, 4, 2, 1};
        // ans is 0 ->if arr do not contains 0
        // if it contains 0 then it should return arr.length

        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int i = 0;
        while (i < n) {
            int correctIndex = nums[i];
            // Only swap if the number is in range and not already in the correct place
            if (nums[i] < n && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Find the first index where the value does not match the index
        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        // If all indices match, the missing number is n
        return n;
    }

    // Helper function to swap elements at indices a and b
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
