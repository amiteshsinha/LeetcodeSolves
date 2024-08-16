package com.leetcode.binaryTree.symmetricTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class SymmetricTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.92
     * MB
     * Beats
     * 15.86%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return isSameTree(root.left, root.right);
    }

    boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p != null & q != null) {
            return (p.val == q.val) && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        }
        return true;
    }
}
