package dynamicprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/23/2023-5:45 PM
 */
public class PartitionEqualSubsetSum416 {
    
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = Math.max(dp[j], dp[j - num] + num);
                if (dp[target] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
