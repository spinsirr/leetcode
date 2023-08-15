package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @FileName: EvaluateReversePolishNotation150
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/14/2023
 */
public class EvaluateReversePolishNotation150 {
    
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> stack.push(-stack.pop() + stack.pop());
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int temp1 = stack.pop();
                    stack.push(stack.pop() / temp1);
                }
                default -> {
                    stack.push(Integer.valueOf(token));
                    
                }
            }
        }
        return stack.pop();
    }
}
