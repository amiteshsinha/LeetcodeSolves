package com.leetcode.binaryTree.inorderTraversal;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.32
     * MB
     * Beats
     * 71.39%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> retList = new ArrayList<>();
        inorderTraversalFromRoot(root, retList);
        return retList;
    }

    private void inorderTraversalFromRoot(TreeNode root,List<Integer> retList) {
        if (root == null) {
            return;
        }
        inorderTraversalFromRoot(root.left, retList);
        retList.add(root.val);
        inorderTraversalFromRoot(root.right, retList);
    }
}
