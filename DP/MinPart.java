
public class MinPart {

    // Function to find the minimum difference of partition
    public static int minPart(int nums[]) {
        int n = nums.length;
        int totalSum = 0;

        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }

        // Target sum is half of total sum
        int target = totalSum / 2;

        // Create a dp array (for subset sum problem)
        boolean dp[][] = new boolean[n + 1][target + 1];

        // Initialize: dp[i][0] = true for all i, since sum 0 can be achieved by not taking any elements
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                // If we do not include nums[i-1], inherit the result from dp[i-1][j]
                dp[i][j] = dp[i - 1][j];

                // If we include nums[i-1], check if we can form the sum j - nums[i-1]
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        // Find the maximum subset sum that is as close as possible to target
        int maxSubsetSum = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[n][j]) {
                maxSubsetSum = j;
                break;
            }
        }

        // The minimum difference is totalSum - 2 * maxSubsetSum
        return totalSum - 2 * maxSubsetSum;
    }

    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};  // Example array

        // Call the minPart function to get the minimum partition difference
        System.out.println("Minimum partition difference: " + minPart(nums));
    }
}
