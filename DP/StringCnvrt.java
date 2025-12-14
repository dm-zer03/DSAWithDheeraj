
public class StringCnvrt {

    // Function to calculate the LCS length
    public static int lcs(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];

        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];  // LCS length
    }

    // Function to calculate the minimum number of operations to convert str1 to str2
    public static int minOperations(String str1, String str2) {
        int lcsLength = lcs(str1, str2);
        int deletions = str1.length() - lcsLength;
        int insertions = str2.length() - lcsLength;
        return deletions + insertions;
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        int result = minOperations(str1, str2);
        System.out.println("Minimum operations to convert '" + str1 + "' to '" + str2 + "': " + result);
    }
}
