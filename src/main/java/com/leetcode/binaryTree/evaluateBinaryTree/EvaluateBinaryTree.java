package com.leetcode.binaryTree.evaluateBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class EvaluateBinaryTree extends AbstractParent {

    @Override
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 0) {
            return false;
        } else if (root.val == 1) {
            return true;
        } else if (root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else {
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
