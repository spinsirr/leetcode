package dynamicprogramming;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/24/2023-1:47 AM
 */
public class TargetSum494 {
    
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > sum) {
            return 0;
        }
        if ((sum + target) % 2 == 1) {
            return 0;
        }
        int key = (sum + target) >> 1;
        int[] dp = new int[key + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int j = key; j >= num; j--) {
                dp[j] += dp[j - num];
            }
        }
        return dp[key];
    }
}
