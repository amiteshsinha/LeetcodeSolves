package com.leetcode.binaryTree.cousinsInBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 41.21
 * MB
 * Beats
 * 58.63%
 * This file was created on 23/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class CousinsInBinaryTree extends AbstractParent {

    @Override
    public boolean isCousins(TreeNode root, int x, int y) {
        return (depth(root, x, 0) == depth(root, y, 0) && parent(root, x) != parent(root, y));
    }

    private int depth(TreeNode root, int x, int depth) {
        if (root == null) {
            return -1;
        }
        if (root.val == x) {
            return depth;
        }
        return Math.max(depth(root.left, x, depth + 1), depth(root.right, x, depth + 1));
    }

    private int parent(TreeNode root, int x) {
        if (root == null) {
            return -1;
        }
        if ((root.left != null && root.left.val == x) ||  (root.right != null && root.right.val == x)) {
            return root.val;
        }
        return Math.max(parent(root.left, x), parent(root.right, x));

    }

}
