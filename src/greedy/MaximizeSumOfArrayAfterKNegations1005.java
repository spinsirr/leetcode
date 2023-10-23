package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/21/2023-10:49 AM
 */
public class MaximizeSumOfArrayAfterKNegations1005 {
    
    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream
            .of(nums)
            .boxed().sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
            .mapToInt(Integer::intValue)
            .toArray();
        int sum = 0;
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
            sum += nums[i];
        }
        if (k % 2 == 1) {
            sum -= 2 * nums[len - 1];
        }
        return sum;
    }
}
