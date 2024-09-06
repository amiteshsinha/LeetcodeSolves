package com.leetcode.linkedList.deleteNodesLinkedListPresentArray;

import com.amitesh.core.baseclass.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteNodesFromLinkedListPresentInArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 20
     * ms
     * Beats
     * 87.14%
     *
     * Memory
     * 63.95
     * MB
     * Beats
     * 93.40%
     * @param nums
     * @param head
     * @return
     */
    @Override
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        // using a for loop decreases time by 10 ms
        for (int i : nums) {
            set.add(i);
        }
        // instead of deleting - simply skip the node
        ListNode prev = head, next = head;
        while (next != null) {
            if (set.contains(next.val)) {
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
