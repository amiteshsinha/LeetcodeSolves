package com.leetcode.binaryTree.invertBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class InvertBinaryTree extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.49
     * MB
     * Beats
     * 6.35%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode temp = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(temp);
        return root;
    }
}
