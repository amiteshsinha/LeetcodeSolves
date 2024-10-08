package com.leetcode.binaryTree.deleteLeavesWithGivenValue;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class DeleteLeavesFromBTwithValue extends AbstractParent {

    @Override
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root.left != null) {
            root.left = removeLeafNodes(root.left, target);
        }
        if (root.right != null) {
            root.right = removeLeafNodes(root.right, target);
        }
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        } else {
            return root;
        }
    }
}
