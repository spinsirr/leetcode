package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 12/2/2023-1:15 AM
 */
public class BestTimetoBuyandSellStock121 {
    
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            buy = Math.min(buy, price);
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }
    
    public int maxProfitDP(int[] prices) {
        int size = prices.length;
        int[][] dp = new int[size][2];
        dp[0][0] = -prices[0];
        for (int i = 1; i < size; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i][0] + prices[i]);
        }
        return dp[size - 1][1];
    }
}
