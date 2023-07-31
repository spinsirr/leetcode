package linkedlist;

import utils.ListNode;

/**
 * @FileName: SwapNodesInPairs24
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/30/2023
 */
public class SwapNodesInPairs24 {
    
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;
        ListNode temp;
        ListNode temp1;
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next;
            temp1 = temp.next.next;
            cur.next = cur.next.next;
            cur.next.next = temp;
            temp.next = temp1;
            cur = cur.next.next;
            
        }
        return dummyHead.next;
    }
    
}
