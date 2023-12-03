package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 12/2/2023-4:06 PM
 */
public class BestTimetoBuyandSellStockIII123 {
    
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[][] dp = new int[size][4];
        dp[0][0] = -prices[0];
        dp[0][2] = -prices[0];
        for (int i = 1; i < size; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);  // 第一次持有
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]); // 第一次不持有
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] - prices[i]); // 第二次持有
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] + prices[i]); // 第二次不持有
        }
        return dp[size - 1][3];
    }
}
