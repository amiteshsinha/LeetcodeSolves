package com.leetcode.linkedList.IncertHCFInLinkedList;

import com.amitesh.core.baseclass.ListNode;

public class InsertHCFInLinkedList extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 44.71
     * MB
     * Beats
     * 89.12%
     * @param head
     * @return
     */
    @Override
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head, next = head.next;
        while (next != null) {
            ListNode temp = new ListNode(curr.val > next.val ? hcf(curr.val, next.val) : hcf(next.val, curr.val));
            curr.next = temp;
            temp.next = next;
            curr = next;
            next = next.next;
        }
        return head;
    }

    //num1 is always greater than num2
    private int hcf(int num1 ,int num2) {
        int temp;
        while (num2 != 0) {
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
