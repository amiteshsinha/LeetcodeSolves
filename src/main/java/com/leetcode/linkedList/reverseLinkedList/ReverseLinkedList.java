package com.leetcode.linkedList.reverseLinkedList;

import com.amitesh.core.baseclass.ListNode;

public class ReverseLinkedList extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 42.18
     * MB
     * Beats
     * 85.04%
     * @param head
     * @return
     */
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return head;
    }
}
