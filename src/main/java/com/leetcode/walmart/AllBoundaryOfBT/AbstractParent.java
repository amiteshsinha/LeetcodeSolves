package com.leetcode.walmart.AllBoundaryOfBT;

import org.junit.jupiter.api.Test;

/**
 * AllBoundaryOfBinaryTree
 * 22/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public int horzlevel;
        public int vertLevel;
        TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public abstract void PrintAllBoundary(TreeNode node);

    @Test
    public void should_give_correct_output1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        PrintAllBoundary(root);
    }

    @Test
    public void should_give_correct_output2() {
    }

    @Test
    public void should_give_correct_output3() {
    }
}