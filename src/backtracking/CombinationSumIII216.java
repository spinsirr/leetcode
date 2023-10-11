package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/8/2023-11:10 PM
 */
public class CombinationSumIII216 {
    
    ArrayList<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, 0, k, 1);
        return result;
    }
    
    private void backtracking(int targetSum, int sum, int k, int startIndex) {
        if (temp.size() > k) {
            return;
        }
        if (sum == targetSum && temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            sum += i;
            temp.add(i);
            backtracking(targetSum, sum, k, i + 1);
            sum -= i;
            temp.removeLast();
        }
    }
}
