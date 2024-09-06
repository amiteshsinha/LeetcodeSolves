package com.leetcode.linkedList.deleteNodesLinkedListPresentArray;

import com.amitesh.core.baseclass.ListNode;

import java.util.HashSet;
import java.util.Set;

public class DeleteNodesFromLinkedListPresentInArrayIter2 extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 72.10
     * MB
     * Beats
     * 7.51%
     * @param nums
     * @param head
     * @return
     */
    @Override
    public ListNode modifiedList(int[] nums, ListNode head) {
        int max = 0;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
        }
        // using a boolean array instead of a set to find presence, decreases runtime
        boolean[] presentArr = new boolean[max + 1];
        for (int i : nums) {
            presentArr[i] = true;
        }
        ListNode prev = head, next = head;
        while (next != null) {
            if (next.val <= max && presentArr[next.val]) {
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
}
