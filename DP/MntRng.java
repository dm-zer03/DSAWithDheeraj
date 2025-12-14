
public class MntRng {

    public static int cntMntRng(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                //inside =dp[j]
                //outside=dp[i-j-1]
                dp[i] += dp[j] * dp[i - j - 1];
                //Ci=Cj*Ci-j-1
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("No of ranges :" + cntMntRng(n));
    }
}
