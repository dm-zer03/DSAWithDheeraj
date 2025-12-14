
import java.util.Arrays;

public class ClimbTree {

    //TC:(O)2^n
    public static int cntWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return cntWays(n - 1) + cntWays(n - 2);
    }

    //TC:O(n)
    public static int cntWaysDP(int n, int ways[]) {
        //with memoization
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = cntWaysDP(n - 1, ways) + cntWaysDP(n - 2, ways);
        return ways[n];
    }

    //TC:O(n)
    public static int tabCntWays(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        //tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 45;
        //n=3->3 & n=4-> 5=>8
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);

        // System.out.println("Rec:" + cntWays(n));
        System.out.println("DP:" + cntWaysDP(n, ways));
        System.out.println("DPWithTab:" + tabCntWays(n));
    }
}
