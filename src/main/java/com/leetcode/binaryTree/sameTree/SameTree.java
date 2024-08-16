package com.leetcode.binaryTree.sameTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class SameTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 40.52
     * MB
     * Beats
     * 93.54%
     * of users with Java
     * @param p
     * @param q
     * @return
     */
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p != null & q != null) {
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return true;
    }
}
