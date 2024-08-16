package com.leetcode.binaryTree.heightBalancedBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class HeightBalancedBinaryTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 44.09
     * MB
     * Beats
     * 77.56%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getDepthCount(root) > 0;
    }

    private int getDepthCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = getDepthCount(node.left);
        int right = getDepthCount(node.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
