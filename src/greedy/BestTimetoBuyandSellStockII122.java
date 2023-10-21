package greedy;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-12:02 AM
 */
public class BestTimetoBuyandSellStockII122 {
    
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}
