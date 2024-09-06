package com.leetcode.linkedList.deleteNodesLinkedListPresentArray;

import com.amitesh.core.baseclass.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteNodesFromLinkedListPresentInArray extends AbstractParent {

    /**
     * Runtime
     * 33
     * ms
     * Beats
     * 5.76%
     *
     * Memory
     * 67.29
     * MB
     * Beats
     * 26.80%
     * @param nums
     * @param head
     * @return
     */
    @Override
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        ListNode temp, prev = head, next = head;
        int currval;
        while (next != null) {
            if (set.contains(next.val)) {
                currval = next.val;
                temp = next.next;
                next.next = null;
                if (head.val == currval) {
                    prev = temp;
                    head = prev;
                } else {
                    prev.next = temp;
                }
                next = prev;
            } else {
                prev = next;
                next = next.next;
            }
        }
        return head;
    }
}
