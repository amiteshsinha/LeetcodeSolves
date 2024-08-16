package com.leetcode.binaryTree.lca2nodes;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class LCAOf2Nodes extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 44.10
     * MB
     * Beats
     * 98.34%
     * @param root
     * @param p
     * @param q
     * @return
     */
    @Override
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        // leaf nodes which dont match the given nodes
        if (root.left == null && root.right == null) {
            return null;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else {
            return right;
        }
    }
}
