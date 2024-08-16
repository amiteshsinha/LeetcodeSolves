package com.leetcode.linkedList.removeDuplicateSorted;

import com.amitesh.core.baseclass.ListNode;

public class RemoveDuplicateFromSortedLinkedList extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 43.98
     * MB
     * Beats
     * 49.02%
     * of users with Java
     * @param head
     * @return
     */
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = head,curr = head;
        while (curr != null) {
            while (curr != null && curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }
            prev.next = curr.next;
            if (prev != curr) {
                curr.next = null;
            }
            curr = prev.next;
            prev = curr;
        }
        return head;
    }
}
