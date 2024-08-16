package com.leetcode.binaryTree.minDepthBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class MinDepthBinaryTree extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 79.47%
     * of users with Java
     * Memory
     * 63.01
     * MB
     * Beats
     * 62.03%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMinDepth(root);
    }

    private int getMinDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }
        //in case root does not have any children
        int left = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
        if (root.left != null) {
            left = getMinDepth(root.left);
        }
        if (root.right != null) {
            right = getMinDepth(root.right);
        }
        return 1 +  Math.min(left, right);
    }
}
