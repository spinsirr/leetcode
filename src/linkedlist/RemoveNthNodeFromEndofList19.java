package linkedlist;

import utils.ListNode;

/**
 * @FileName: RemoveNthNodeFromEndofList19
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/30/2023
 */
public class RemoveNthNodeFromEndofList19 {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        while (n >= 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        while (fast != null && slow != null){
            fast = fast.next;
            slow = slow.next;
        }
        assert slow != null;
        slow.next = slow.next.next;
        return dummyHead.next;
    }
}
