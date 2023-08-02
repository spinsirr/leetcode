package hashtable;

import java.util.HashMap;

/**
 * @FileName: TwoSum1
 * @Description: Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target. You may assume that each input would have exactly one
 * solution, and you may not use the same element twice. You can return the answer in any order.
 * @Author: Spencer ZHAO
 * @Date: 8/2/2023
 */
public class TwoSum1 {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
