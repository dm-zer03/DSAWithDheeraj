
import java.util.Arrays;

public class CatalanNum {

    public static int catNum(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catNum(i) * catNum(n - i - 1);
        }
        return ans;
    }

    public static int memoCatlan(int n, int dp[]) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += memoCatlan(i, dp) * memoCatlan(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    public static int catalanTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
                //Ci=Cj*Ci-j-1
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Recursion: " + catNum(n));
        System.out.println("Memoizations: " + memoCatlan(n, dp));
        System.out.println("Tabulattion: " + catalanTab(n));
    }
}
