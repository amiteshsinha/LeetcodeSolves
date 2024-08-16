package com.leetcode.binaryTree.maxDepthBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class MaxDepthOfBinaryTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 42.28
     * MB
     * Beats
     * 80.98%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }

    private int getMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getMaxDepth(root.left), getMaxDepth(root.right));
    }
}
