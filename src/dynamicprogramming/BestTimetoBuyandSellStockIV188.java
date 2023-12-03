package dynamicprogramming;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 12/3/2023-1:44 AM
 */
public class BestTimetoBuyandSellStockIV188 {
    
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        int variant = 2 * k + 1;
        int[][] dp = new int[size][variant];
        for (int i = 1; i < variant; i += 2) {
            dp[0][i] = -prices[0];
        }
        System.out.println(Arrays.deepToString(dp));
        for (int i = 1; i < size; i++) {
            for (int j = variant - 1; j > 0; j--) {
                dp[i][j] = (int) Math.max(dp[i - 1][j],
                    dp[i - 1][j - 1] + Math.pow(-1, j) * prices[i]);
            }
        }
        return dp[size - 1][variant - 1];
    }
    
    public int maxProfitCompress(int k, int[] prices) {
        if (prices.length == 0 || k == 0) {
            return 0;
        }
        int variant = 2 * k + 1;
        int[] dp = new int[variant];
        for (int i = 1; i < variant; i += 2) {
            dp[i] = -prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = variant - 1; j > 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - 1] + (j % 2 == 0 ? 1 : -1) * prices[i]);
            }
        }
        return dp[variant - 1];
    }
}
