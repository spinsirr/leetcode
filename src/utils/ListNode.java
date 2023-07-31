package utils;

/**
 * @FileName: ListNode
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/25/2023
 */
public class ListNode {
    
    public int val;
    public ListNode next;
    
    
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
    
    public ListNode(int val) {
        this(val, null);
    }
    
    public ListNode() {
        this(0);
        next = null;
    }
}
