
//TC : O(d×n).
//SC : O(n+k)
public class RadixSort {

    // Main method for Radix Sort
    public static void radixSort(int[] nums) {
        int max = getMax(nums);

        // Start sorting from the least significant digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(nums, exp);
        }
    }

    // Helper method to get the maximum value in the array
    private static int getMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Optimized counting sort based on a specific digit
    private static void countingSortByDigit(int[] nums, int exp) {
        int n = nums.length;
        int[] output = new int[n];  // Output array to store sorted order based on current digit
        int[] count = new int[10];  // Count array for each digit (0-9)

        // Count occurrences of each digit in the current place value
        for (int num : nums) {
            int digit = (num / exp) % 10;
            count[digit]++;
        }

        // Update count array to contain actual positions in output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array in reverse order to maintain stability
        for (int i = n - 1; i >= 0; i--) {
            int digit = (nums[i] / exp) % 10;
            output[--count[digit]] = nums[i];
        }

        // Copy sorted numbers from output back to the original array
        System.arraycopy(output, 0, nums, 0, n);
    }

    // Main method to test Radix Sort
    public static void main(String[] args) {
        int[] nums = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(nums);
        System.out.println("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
