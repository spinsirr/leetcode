package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 12/2/2023-2:16 PM
 */
public class BestTimetoBuyandSellStockII122 {
    
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[][] dp = new int[size][2];
        dp[0][0] = -prices[0];
        for (int i = 1; i < size; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i], dp[i - 1][1]);
        }
        return dp[size - 1][1];
    }
    
    public int maxProfitGreedy(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }
}
