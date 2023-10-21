package greedy;

import java.util.Arrays;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/20/2023-12:01 AM
 */
public class WiggleSubsequence376 {
    
    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        int preDiff = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int curDiff = nums[i + 1] - nums[i];
            if ((preDiff >= 0 && curDiff < 0) || (preDiff <= 0 && curDiff > 0)) {
                count++;
                preDiff = curDiff;
            }
        }
        return count;
    }
}
