package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/16/2023-8:25 PM
 */
public class UniqueBinarySearchTrees96 {
    
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }
}
