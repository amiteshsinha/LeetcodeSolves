package com.leetcode.linkedList.removeLinkedListElements;

import com.amitesh.core.baseclass.ListNode;

public class RemoveLinkedListElements extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 92.39%
     *
     * Memory
     * 44.72
     * MB
     * Beats
     * 99.30%
     * @param head
     * @param val
     * @return
     */
    @Override
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head, next = head;
        while (next != null) {
            if (next.val == val) {
                if (head == next) {
                    head = next.next;
                } else {
                    prev.next = next.next;
                }
            } else {
                prev = next;
            }
            next = next.next;
        }
        return head;
    }

    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements1(head.next, val);
        return head.val == val ? head.next : head;
    }
}
