package com.leetcode.walmart.AllBoundaryOfBT;

public class AllBoundaryOfBinaryTree extends AbstractParent {

    @Override
    public void PrintAllBoundary(TreeNode root) {
        // step 1 - add levels to the node
        assignLevel(root, 0, 0);
        int negative = getMax(root, 0);
        int positive = getMax(root, 1);

    }

    private int getMax(TreeNode root, int i) {
        if (root.left == null && root.right == null) {
            return root.horzlevel;
        }
        int left = getMax(root.left, i);
        int right = getMax(root.right, i);
        if (i == 0) {
            return Math.min(left, right);
        } else {
            return Math.max(left, right);
        }
    }

    private void assignLevel(TreeNode root, int i, int j) {
        if (root == null) {
            return;
        }
        root.horzlevel = i;
        root.vertLevel = j;
        assignLevel(root.left, i - 1, i + 1);
        assignLevel(root.right, i + 1, i + 1);
    }
}
