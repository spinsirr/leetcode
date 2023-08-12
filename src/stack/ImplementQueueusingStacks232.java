package stack;

import java.util.Stack;

/**
 * @FileName: ImplementQueueusingStacks232
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/10/2023
 */
public class ImplementQueueusingStacks232 {
    
    class MyQueue {
        
        Stack<Integer> stackIn;
        Stack<Integer> stackOut;
        
        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }
        
        public void push(int x) {
            stackIn.push(x);
        }
        
        public int pop() {
            dumpStackIn();
            return stackOut.pop();
        }
        
        public int peek() {
            dumpStackIn();
            return stackOut.peek();
        }
        
        public boolean empty() {
            return stackIn.empty() && stackOut.empty();
        }
        
        private void dumpStackIn() {
            if (!stackOut.empty()) {
                return;
            }
            while (!stackIn.empty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }
}
