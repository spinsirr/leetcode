package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/9/2023-12:54 PM
 */
public class LetterCombinationsofaPhoneNumber17 {
    
    ArrayList<String> result = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtracking(digits, numString, 0);
        return result;
    }
    
    StringBuilder temp = new StringBuilder();
    
    private void backtracking(String digits, String[] numString, int num) {
        if (num == digits.length()) {
            result.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backtracking(digits, numString, num + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
