package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/16/2023-11:27 PM
 */
public class Subsets78 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return result;
    }
    
    private void backtracking(int[] num, int startIndex) {
        result.add(new ArrayList<>(temp));
        if (startIndex >= num.length) {
            return;
        }
        for (int i = startIndex; i < num.length; i++) {
            temp.add(num[i]);
            backtracking(num, i + 1);
            temp.removeLast();
        }
    }
}
