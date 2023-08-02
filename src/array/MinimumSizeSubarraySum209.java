package array;

/**
 * @FileName: arrays.MinimumSizeSubarraySum209
 * @Description: Given an array of positive integers nums and a positive integer target, return the
 * minimal length of a subarray whose sum is greater than or equal to target. If there is no such
 * subarray, return 0 instead.
 * @Author: Spencer ZHAO
 * @Date: 7/24/2023
 */
public class MinimumSizeSubarraySum209 {
    
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                int subLength = j - i + 1;
                res = Math.min(res, subLength);
                sum -= nums[i];
                i++;
            }
        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}
