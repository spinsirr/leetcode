package linkedlist;

import utils.ListNode;

/**
 * @FileName: ReverseLinkedList206
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/29/2023
 */
public class ReverseLinkedList206 {
    
    // iterate
    // public ListNode reverseList(ListNode head) {
    //     ListNode cur = head;
    //     ListNode pre = null;
    //     while (cur != null) {
    //         ListNode tmp = cur.next;
    //         cur.next = pre;
    //         pre = cur;
    //         cur = tmp;
    //     }
    //     return pre;
    // }
    
    // recursive
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }
    
    public ListNode reverse(ListNode cur, ListNode pre) {
        if (cur == null) {
            return pre;
        }
        ListNode tmp = cur.next;
        cur.next = pre;
        return reverse(tmp, cur);
    }
    
}
