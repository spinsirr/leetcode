package stack;

import java.util.Stack;

/**
 * @FileName: ValidParentheses20
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/13/2023
 */
public class ValidParentheses20 {
    
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (char e : s.toCharArray()) {
            switch (e) {
                case '(' -> chars.push(')');
                case '[' -> chars.push(']');
                case '{' -> chars.push('}');
                default -> {
                    if (chars.isEmpty() || chars.peek() != e) {
                        return false;
                    } else {
                        chars.pop();
                    }
                }
            }
        }
        return chars.isEmpty();
    }
}
