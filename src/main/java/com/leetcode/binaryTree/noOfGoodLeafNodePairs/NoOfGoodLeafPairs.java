package com.leetcode.binaryTree.noOfGoodLeafNodePairs;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

public class NoOfGoodLeafPairs extends AbstractParent {

    int retVal = 0;
    @Override
    public int countPairs(TreeNode root, int distance) {
        if (distance == 1) {
            return 0;
        }
        getDistanceOfLeafNode(root, 0, distance);
        return retVal/2;
    }

    private void getDistanceOfLeafNode(TreeNode root, int currDist, int distance) {
        if (root == null) {
            return;
        }
        if (currDist > distance) {
            return;
        }
        if (root.left == null && root.right == null) {
           retVal++;
            return;
        }
        getDistanceOfLeafNode(root.left, currDist + 1, distance);
        getDistanceOfLeafNode(root.right, currDist + 1, distance);
    }
}
