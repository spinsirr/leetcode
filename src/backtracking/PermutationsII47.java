package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/18/2023-4:10 PM
 */
public class PermutationsII47 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    boolean[] used;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        Arrays.fill(used, false);
        backtracking(nums, used);
        return result;
    }
    
    private void backtracking(int[] nums, boolean[] used) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1] || used[i]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            backtracking(nums, used);
            temp.removeLast();
            used[i] = false;
        }
    }
}
