package linkedlist;

import Utils.ListNode;

/**
 * @FileName: RemoveLinkedListElements203
 * @Description: Given the head of a linked list and an integer val, remove all the nodes of the
 * linked list that has ListNode.val == val, and return the new head.
 * @Author: Spencer ZHAO
 * @Date: 7/27/2023
 */
public class RemoveLinkedListElements203 {
    
    public ListNode removeElements(ListNode head, int val) {
        // recursive solution
        
        // if (head == null) {
        //     return null;
        // }
        // head.next = removeElements(head.next, val);
        // return head.val == val ? head.next : head;
        
        // plain solution
        
        // while (head != null && head.val == val) {
        //     head = head.next;
        // }
        // ListNode cur = head;
        // while (cur!= null && cur.next != null) {
        //     if (cur.next.val == val) {
        //         cur.next = cur.next.next;
        //     } else {
        //         cur = cur.next;
        //     }
        // }
        // return head;
        
        // dummy head solution
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        newHead.next = head;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return newHead.next;
    }
}
