package com.leetcode.binaryTree.sumOfLeftLeafNodes;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class SumOfLeftLeaves extends AbstractParent {

    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, 0);
    }

    public int sumOfLeftLeaves(TreeNode root,int count) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return count < 0 ? root.val : 0;
        }
        return sumOfLeftLeaves(root.left, - 1) + sumOfLeftLeaves(root.right, 1);
    }
}
