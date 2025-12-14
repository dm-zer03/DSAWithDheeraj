
public class TargetSubSet {

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];
        // i -> items & j -> target sum
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;  // If sum is 0, we can always form it by selecting no items.
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                int v = arr[i - 1];
                // Include the current element if it can fit in the current sum
                if (v <= j && dp[i - 1][j - v]) {
                    dp[i][j] = true;
                } // Exclude the current element
                else if (dp[i - 1][j]) {
                    dp[i][j] = true;
                }
            }
        }

        // Print the dp array
        printDP(dp, n, sum);

        return dp[n][sum];
    }

    public static void printDP(boolean[][] dp, int n, int sum) {
        System.out.println("DP Array:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println("Target sum subset possible: " + targetSumSubset(arr, sum));
    }
}
