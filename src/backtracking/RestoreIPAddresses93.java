package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/16/2023-9:00 PM
 */
public class RestoreIPAddresses93 {
    
    ArrayList<String> result = new ArrayList<>();
    
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder(s);
        backtracking(sb, 0, 0);
        return result;
    }
    
    private void backtracking(StringBuilder s, int startIndex, int pointNum) {
        if (pointNum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                result.add(s.toString());
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s.insert(i + 1, '.');
                pointNum++;
                backtracking(s, i + 2, pointNum);
                s.deleteCharAt(i + 1);
                pointNum--;
            }
        }
    }
    
    private boolean isValid(StringBuilder s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
