package com.leetcode.binaryTree.uniValuedBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class UnivaluedBinaryTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.09
     * MB
     * Beats
     * 43.69%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isUnivalTree(root, root.val);
    }

    boolean isUnivalTree(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        if (root.val != val) {
            return false;
        }
        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }
}
