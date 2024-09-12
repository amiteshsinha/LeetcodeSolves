package com.leetcode.binarySearchTree.convertSortedListToBST;

import com.amitesh.core.baseclass.ListNode;
import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedLinkedListToBSTIter1 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 44.38
     * MB
     * Beats
     * 97.21%
     */
    @Override
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        ListNode slow = head, fast = head, mid = slow;
        while (fast != null && fast.next != null) {
            mid = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        // slow is at mid and fast is at the end
        TreeNode root = new TreeNode(slow.val);
        mid.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;

    }


}
