package com.leetcode.binarySearchTree.lca2nodes;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class LCAOf2Nodes extends AbstractParent {

    /**
     * Runtime
     * 5
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 44.61
     * MB
     * Beats
     * 83.06%
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
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
