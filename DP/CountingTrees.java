//Find number of all possible BSTs with given n nodes

public class CountingTrees {
//TC:O(2^n)

    public static int countBST(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                //left subTree=dp[j]
                //right subTree=dp[i-j-1]
                dp[i] += dp[j] * dp[i - j - 1];
                //Ci=Cj*Ci-j-1
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("No Of BST :" + countBST(n));
    }
}
