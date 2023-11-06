package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/4/2023-9:48 PM
 */
public class MinCostClimbingStairs746 {
    
    
    public int minCostClimbingStairs(int[] cost) {
        
        int size = cost.length;
        if (size < 2) {
            return 0;
        }
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i <= size; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[cost.length];
    }
}
