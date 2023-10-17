package backtracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/16/2023-2:59 PM
 */
public class PalindromePartitioning131 {
    
    ArrayList<List<String>> result = new ArrayList<>();
    Deque<String> temp = new ArrayDeque<>();
    
    public List<List<String>> partition(String s) {
        backtracking(s, 0);
        return result;
    }
    
    private void backtracking(String s, int startIndex) {
        if (startIndex >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isPalindrome(s, startIndex, i)) {
                String str = s.substring(startIndex, i + 1);
                temp.add(str);
            } else {
                continue;
            }
            backtracking(s, i + 1);
            temp.removeLast();
        }
    }
    
    private boolean isPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
