package com.leetcode.binaryTree.BinaryTreePaths;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLeafPaths extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.54%
     * of users with Java
     * Memory
     * 41.92
     * MB
     * Beats
     * 96.26%
     * of users with Java
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> retList = new ArrayList<>();
        binaryTreePaths(root, retList, new StringBuilder());
        return retList;
    }

    private void binaryTreePaths(TreeNode root, List<String> retList, StringBuilder s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            s.append(root.val);
            retList.add(s.toString());
            return;
        }
        s.append(root.val);
        s.append("->");
        int k = s.length();
        binaryTreePaths(root.left, retList, s);
        s.delete(k, s.length());
        binaryTreePaths(root.right,retList, s);
    }
}
