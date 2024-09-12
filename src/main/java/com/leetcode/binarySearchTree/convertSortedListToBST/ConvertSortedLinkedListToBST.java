package com.leetcode.binarySearchTree.convertSortedListToBST;

import com.amitesh.core.baseclass.ListNode;
import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedLinkedListToBST extends AbstractParent {
    @Override
    public TreeNode sortedListToBST(ListNode head) {
        // Step 1 - go till the mid - have 1 pointer prior to the mid
        // Step 2- use the mid as the root, reverse the 1st half of the list
        // Step 3- create tree

        // or get size of the list - copy data to array. and then from array create tree
        List<Integer> sortedList = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            sortedList.add(temp.val);
            temp = temp.next;
        }
        return convertToBST(sortedList, 0, sortedList.size() - 1);
    }

    private TreeNode convertToBST(List<Integer> sortedList, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(sortedList.get(mid));
        root.left = convertToBST(sortedList, left, mid - 1);
        root.right = convertToBST(sortedList, mid + 1, right);
        return root;
    }
}
