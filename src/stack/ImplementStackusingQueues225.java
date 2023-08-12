package stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @FileName: ImplementStackusingQueues225
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/10/2023
 */
public class ImplementStackusingQueues225 {
    
    Queue<Integer> queue;
    
    
    class MyStack {
        
        Queue<Integer> queue;
        
        public MyStack() {
            queue = new LinkedList<>();
        }
        
        public void push(int x) {
            queue.add(x);
        }
        
        public int pop() {
            reposition();
            return queue.poll();
        }
        
        public int top() {
            reposition();
            int res = queue.poll();
            queue.add(res);
            return res;
        }
        
        public boolean empty() {
            return queue.isEmpty();
        }
        
        private void reposition() {
            int size = queue.size();
            size--;
            while (size-- > 0) {
                queue.add(queue.poll());
            }
        }
    }
    
    
}
