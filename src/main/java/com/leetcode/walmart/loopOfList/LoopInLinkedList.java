package com.leetcode.walmart.loopOfList;

public class LoopInLinkedList extends AbstractParent {

    @Override
    public void findAndFixLoop(Node head) {
        Node slow = head, fast = head;
        int temp = 0;
        while (slow != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            } else {
                // no loop
                break;
            }
            // loop exists
            if (slow == fast) {
                Node ptr = slow;
                Node ptr2 = head;
                while (ptr != ptr2) {
                    ptr = ptr.next;
                    ptr2 = ptr2.next;
                }
                System.out.println(ptr.val);
                break;
            }
        }
    }

}
