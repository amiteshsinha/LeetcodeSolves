package com.leetcode.binarySearchTree.balanceBST;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalanceBST extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 96.27%
     *
     * Memory
     * 45.49
     * MB
     * Beats
     * 86.67%
     * @param root
     * @return
     */

    List<Integer> sortedList = new ArrayList<>();
    @Override
    public TreeNode balanceBST(TreeNode root) {
        getListfromBST(root);
        int size = sortedList.size();
        TreeNode newRoot = convertListToBalancedTree( 0, size - 1);
        return newRoot;
    }

    private TreeNode convertListToBalancedTree(int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(sortedList.get(mid));
        root.left = convertListToBalancedTree(left, mid - 1);
        root.right = convertListToBalancedTree(mid + 1, right);
        return root;
    }

    private void getListfromBST(TreeNode root) {
        if (root == null) {
            return;
        }
        getListfromBST(root.left);
        sortedList.add(root.val);
        getListfromBST(root.right);
    }
}
