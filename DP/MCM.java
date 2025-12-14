
import java.util.*;

public class MCM {

    public static int mCM(int arr[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mCM(arr, i, k);// Ai...Ak =>arr[i-1] * arr[k]
            int cost2 = mCM(arr, k + 1, j);//Ai+1 ...Aj => arr[k] * arr[j]
            int cost3 = arr[i - 1] * arr[k] * arr[j];//a*b*d
            int finCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finCost);

        }
        return ans;
    }
//TC:log(n2)

    public static int mcmMemo(int arr[], int i, int j, int dp[][]) {
        if (i == j) {
            return 0;

        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = mcmMemo(arr, i, k, dp);
            int cost2 = mcmMemo(arr, k + 1, j, dp);
            int cost3 = arr[i - 1] * arr[k] * arr[j];

            ans = Math.min(ans, cost1 + cost2 + cost3);
        }
        return dp[i][j] = ans;
    }

    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        // Initialization: No cost for multiplying a single matrix (dp[i][i] = 0)
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        // Bottom-up DP approach
        for (int len = 2; len <= n - 1; len++) { // Length of the chain (number of matrices being multiplied)
            for (int i = 1; i <= n - len; i++) { // Starting matrix index
                int j = i + len - 1; // Ending matrix index
                dp[i][j] = Integer.MAX_VALUE; // Initialize dp[i][j] to a large number (minimization problem)

                // Finding the minimum cost to multiply matrices from i to j
                for (int k = i; k <= j - 1; k++) {
                    // Cost of splitting at k
                    int cost1 = dp[i][k];        // Cost of multiplying matrices from i to k
                    int cost2 = dp[k + 1][j];    // Cost of multiplying matrices from k+1 to j
                    int costOfMultiply = arr[i - 1] * arr[k] * arr[j]; // Cost of multiplying the result of two halves
                    int totalCost = cost1 + cost2 + costOfMultiply;

                    // Update dp[i][j] to store the minimum cost
                    dp[i][j] = Math.min(dp[i][j], totalCost);
                }
            }
        }

        // The minimum cost to multiply matrices from 1 to n-1 will be in dp[1][n-1]
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};//n=5
        int n = arr.length;

        // System.out.println(mCM(arr, 1, n - 1));
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println("Minimum cost of matrix multiplication: " + mcmTab(arr));
        System.out.println(mcmMemo(arr, 1, n - 1, dp));
    }
}
