package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/17/2023-12:05 AM
 */
public class SubsetsII90 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums, 0);
        return result;
    }
    
    private void backtracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(temp));
        if (startIndex > nums.length) {
            return;
        }
        for (int i = startIndex; i < nums.length; i++) {
            if (i > startIndex && nums[i - 1] == nums[i]) {
                continue;
            }
            temp.add(nums[i]);
            backtracking(nums, i + 1);
            temp.removeLast();
        }
    }
    
}
