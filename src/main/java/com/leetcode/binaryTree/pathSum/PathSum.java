package com.leetcode.binaryTree.pathSum;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class PathSum extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 42.84
     * MB
     * Beats
     * 65.17%
     * @param root
     * @param targetSum
     * @return
     */
    @Override
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        int temp = targetSum - root.val;
        if (temp == 0 && root.left == null && root.right == null) {// needs to be leaf node
            return true;
        }
        return hasPathSum(root.left, temp) || hasPathSum(root.right, temp);
    }
}
