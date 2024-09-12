package com.leetcode.linkedList.hascycle;

import com.amitesh.core.baseclass.ListNode;

public class LinkedListCycleDetection extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 44.01
     * MB
     * Beats
     * 89.88%
     * @param head
     * @return
     */
    @Override
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
