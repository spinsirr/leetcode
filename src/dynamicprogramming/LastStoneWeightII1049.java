package dynamicprogramming;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/23/2023-5:58 PM
 */
public class LastStoneWeightII1049 {
    
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum >> 1;
        int[] dp = new int[target + 1];
        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }
        return sum - dp[target] - dp[target];
    }
}
