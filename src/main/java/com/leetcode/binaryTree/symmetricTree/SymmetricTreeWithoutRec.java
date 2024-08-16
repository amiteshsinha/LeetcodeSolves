package com.leetcode.binaryTree.symmetricTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.Stack;

public class SymmetricTreeWithoutRec extends AbstractParent {

    /**
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        // the following are same so going by that logic
//        TreeNode.preOrderTraversal(root.left);
//        TreeNode.revPreOrderTraversal(root.right);
// use stack - populate lists then compare - can we compare while populating ?
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        leftStack.push(root.left);
        rightStack.push(root.right);
        while (!leftStack.isEmpty() && !rightStack.isEmpty()) {
            TreeNode left = leftStack.pop();
            TreeNode right = rightStack.pop();
            if (left == null & right == null) {
                continue;
            }
            if ((left == null && right != null) || (left != null && right == null)) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            leftStack.push(left.right);
            leftStack.push(left.left);
            rightStack.push(right.left);
            rightStack.push(right.right);
        }
        if (!leftStack.isEmpty() || !rightStack.isEmpty()) {
            return false;
        }
        return true;
    }
}
