package linkedlist;

import Utils.ListNode;

/**
 * @FileName: DesignLinkedList707
 * @Description: Design your implementation of the linked list. You can choose to use a singly or
 * doubly linked list. A node in a singly linked list should have two attributes: val and next. val
 * is the value of the current node, and next is a pointer/reference to the next node. If you want
 * to use the doubly linked list, you will need one more attribute prev to indicate the previous
 * node in the linked list. Assume all nodes in the linked list are 0-indexed.
 * @Author: Spencer ZHAO
 * @Date: 7/28/2023
 */
public class DesignLinkedList707 {
    
    
    class MyLinkedList {
        
        ListNode head = null;
        ListNode tail = null;
        int size = 0;
        
        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                cur = cur.next;
            }
            return cur.val;
        }
        
        public void addAtHead(int val) {
            ListNode addNode = new ListNode(val);
            if (head == null) {
                head = addNode;
                tail = addNode;
            } else {
                addNode.next = head;
                head = addNode;
            }
            size++;
        }
        
        public void addAtTail(int val) {
            ListNode addNode = new ListNode(val);
            if (head == null) {
                head = addNode;
                tail = addNode;
            } else {
                tail.next = addNode;
                tail = addNode;
            }
            size++;
        }
        
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
            } else if (index == size) {
                addAtTail(val);
            } else {
                ListNode pre = new ListNode();
                ListNode addNode = new ListNode(val);
                pre.next = head;
                for (int i = 0; i < index; i++) {
                    pre = pre.next;
                }
                addNode.next = pre.next;
                pre.next = addNode;
                size++;
            }
        }
        
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) {
                return;
            }
            if (index == 0) {
                head = head.next;
                if (head == null) {
                    tail = null;
                }
            } else {
                ListNode pre = new ListNode();
                ListNode cur = head;
                for (int i = 0; i < index; i++) {
                    pre = cur;
                    cur = cur.next;
                }
                pre.next = cur.next;
                if (cur == tail) {
                    tail = pre;
                }
            }
            size--;
        }
    }
}
