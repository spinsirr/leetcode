package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/18/2023-12:19 AM
 */
public class NondecreasingSubsequences491 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return result;
    }
    
    private void backtracking(int[] nums, int startIndex) {
        if (temp.size() >= 2) {
            result.add(new ArrayList<>(temp));
        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if (!temp.isEmpty() && temp.getLast() > nums[i] || hs.contains(nums[i])) {
                continue;
            }
            hs.add(nums[i]);
            temp.add(nums[i]);
            backtracking(nums, i + 1);
            temp.removeLast();
        }
    }
}
