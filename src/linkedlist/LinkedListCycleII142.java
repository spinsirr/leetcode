package linkedlist;

import Utils.ListNode;

/**
 * @FileName: LinkedListCycleII142
 * @Description: TODO
 * @Author: Spencer ZHAO
 * @Date: 7/30/2023
 */
public class LinkedListCycleII142 {
    
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode meetNode = fast;
                ListNode index = head;
                while (meetNode != index) {
                    index = index.next;
                    meetNode = meetNode.next;
                }
                return index;
            }
        }
        return null;
    }
}
