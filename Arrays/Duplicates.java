
public class Duplicates {

    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // correct index for the current number
            if (nums[i] != nums[correctIndex]) {
                // Swap to place the element at its correct position
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // After sorting, find the duplicate number
        // The number that doesn't match its index will be the duplicate
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }

        return -1; // This line should never be reached, since there's always a duplicate
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
