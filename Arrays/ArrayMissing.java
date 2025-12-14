
import java.util.ArrayList;
import java.util.List;

public class ArrayMissing {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;

        int i = 0;
        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Collect all indices where numbers are missing
        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }

        return result;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    // main method for testing
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missingNumbers = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + missingNumbers);
    }
}
