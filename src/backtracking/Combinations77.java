package backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/8/2023-1:33 PM
 */
public class Combinations77 {
    
    LinkedList<Integer> path = new LinkedList<>();
    ArrayList<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }
    
    private void backtracking(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracking(n, k, i + 1);
            path.removeLast();
        }
    }
}
