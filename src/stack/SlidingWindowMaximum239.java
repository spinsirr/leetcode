package stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
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
    
    class MyQueue {
        
        Deque<Integer> queue = new LinkedList<>();
        
        void pop(int val) {
            if (!queue.isEmpty() && val == queue.getFirst()) {
                queue.poll();
            }
        }
        
        void push(int val) {
            while (!queue.isEmpty() && queue.getLast() < val) {
                queue.removeLast();
            }
            queue.add(val);
        }
        
        int getMaxValue() {
            return queue.peek();
        }
    }
    
    class Solution {
        
        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 1) {
                return nums;
            }
            
            int len = nums.length - k + 1;
            int[] res = new int[len];
            int num = 0;
            MyQueue myQueue = new MyQueue();
            for (int i = 0; i < k; i++) {
                myQueue.push(nums[i]);
            }
            res[num++] = myQueue.getMaxValue();
            for (int i = k; i < nums.length; i++) {
                myQueue.pop(nums[i - k]);
                myQueue.push(nums[i]);
                res[num++] = myQueue.getMaxValue();
            }
            return res;
        }
    }
}
