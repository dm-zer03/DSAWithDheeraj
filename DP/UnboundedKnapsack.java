
public class UnboundedKnapsack {

    // Recursive version
    public static int unboundedKnapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            // Include the item multiple times (don't reduce n)
            int ans1 = val[n - 1] + unboundedKnapsack(val, wt, W - wt[n - 1], n);

            // Exclude the item
            int ans2 = unboundedKnapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            // Not Valid, exclude the item
            return unboundedKnapsack(val, wt, W, n - 1);
        }
    }

    // Memoized version
    public static int unboundedKnapsackMemo(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            // Include the item multiple times
            int ans1 = val[n - 1] + unboundedKnapsackMemo(val, wt, W - wt[n - 1], n, dp);

            // Exclude the item
            int ans2 = unboundedKnapsackMemo(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            dp[n][W] = unboundedKnapsackMemo(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    // Tabulation version
    public static int unboundedKnapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // Initialize dp table (optional as Java initializes arrays to 0 by default)
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0; // When W = 0, the max profit is 0
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incProfit = v + dp[i][j - w]; // Allow including the same item again
                    int excProfit = dp[i - 1][j];     // Exclude the item
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    dp[i][j] = dp[i - 1][j];  // Exclude the item
                }
            }
        }

        printDP(dp, n, W); // Print the DP array
        return dp[n][W];
    }

    // Method to print the DP array
    public static void printDP(int[][] dp, int n, int W) {
        System.out.println("DP Array:");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Recursive Unbounded Knapsack: " + unboundedKnapsack(val, wt, W, val.length));
        System.out.println("Memoized Unbounded Knapsack: " + unboundedKnapsackMemo(val, wt, W, val.length, dp));
        System.out.println("Tabulated Unbounded Knapsack: " + unboundedKnapsackTab(val, wt, W));
    }
}
