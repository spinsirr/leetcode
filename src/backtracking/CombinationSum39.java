package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/11/2023-12:53 AM
 */
public class CombinationSum39 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, 0, target, 0);
        return result;
    }
    
    private void backtracking(int[] candidates, int sum, int target, int startIndex) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            temp.add(candidates[i]);
            sum += candidates[i];
            backtracking(candidates, sum, target, i);
            temp.removeLast();
            sum -= candidates[i];
        }
    }
}
