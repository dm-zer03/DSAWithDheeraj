
import java.util.Arrays;

public class MinJumps {

    public static int minJmp(int nums[]) {
        int n = nums.length;
        // dp[i] will store the minimum number of jumps needed to reach the end from index i
        int dp[] = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with MAX_VALUE as default for unreachable positions
        dp[n - 1] = 0; // Base case: No jump needed to reach the end if we are already at the last position

        // Traverse the array from the second last element to the first
        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i]; // Number of steps we can take from index i

            // Check the next possible steps from i
            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) { // If j is reachable
                    dp[i] = Math.min(dp[i], dp[j] + 1); // Take the minimum number of jumps
                }
            }
        }

        // dp[0] contains the result: minimum jumps from index 0 to the end
        // If dp[0] is still MAX_VALUE, that means the end is unreachable
        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0];
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1, 4};  // Example input array
        System.out.println("Minimum jumps to reach the end: " + minJmp(nums));
    }
}
