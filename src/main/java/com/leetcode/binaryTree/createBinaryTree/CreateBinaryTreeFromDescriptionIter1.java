package com.leetcode.binaryTree.createBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class CreateBinaryTreeFromDescriptionIter1 extends AbstractParent {

    /**
     * @param descriptions
     * @return
     */
    @Override
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> childrenSet = new HashSet<>();
        int rootVal = 0;
        for (int i = 0; i < descriptions.length; i++) {
            childrenSet.add(descriptions[i][1]);
        }
        for (int i = 0; i < descriptions.length; i++) {
            if (!childrenSet.contains(descriptions[i][0])) {
                rootVal = descriptions[i][0];
                break;
            }
        }
        TreeNode root = getTreeForNode(rootVal, descriptions);

        return root;
    }

    private TreeNode getTreeForNode(int rootVal, int[][] descriptions) {
        TreeNode root = new TreeNode(rootVal);
        for (int i = 0; i < descriptions.length; i++) {

        }
        return root;
    }
}
