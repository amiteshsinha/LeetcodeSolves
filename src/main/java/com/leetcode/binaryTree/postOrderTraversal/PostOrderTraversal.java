package com.leetcode.binaryTree.postOrderTraversal;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 41.32
 * MB
 * Beats
 * 82.09%
 */
public class PostOrderTraversal extends AbstractParent {

    List<Integer> integerList = new ArrayList<>();

    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return integerList;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        if (root != null) {
            integerList.add(root.val);
            return integerList;
        }
        return integerList;
    }
}
