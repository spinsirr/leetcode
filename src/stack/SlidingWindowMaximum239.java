package stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @FileName: SlidingWindowMaximum239
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 8/15/2023
 */
public class SlidingWindowMaximum239 {
    
    Deque<Integer> queue;
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        queue = Arrays.asList(nums);
        
    }
    
    private void pop(int val) {
        if (!queue.isEmpty() && val == queue.getFirst()) {
            queue.removeFirst();
        }
    }
    
    private void push(int val) {
        while (!queue.isEmpty() && queue.getLast() < val) {
            queue.removeLast();
        }
        queue.push(val);
    }
    
    private int getMaxValue() {
        return queue.getFirst();
    }
}
