package com.leetcode.binaryTree.convertBinaryTreeToSortedArray;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class ConvertSortedArrayToBinary extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 42.68
     * MB
     * Beats
     * 95.07%
     * of users with Java
     * @param nums
     * @return
     */
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = createBinaryTreeFromSortedArr(nums, 0, nums.length - 1);
        return root;
    }

    private TreeNode createBinaryTreeFromSortedArr(int[] nums, int min, int max) {
        if (min > max) {
            return null;
        }
        int mid = (min + max)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBinaryTreeFromSortedArr(nums, min, mid - 1);
        root.right = createBinaryTreeFromSortedArr(nums, mid + 1 , max);
        return root;
    }
}
