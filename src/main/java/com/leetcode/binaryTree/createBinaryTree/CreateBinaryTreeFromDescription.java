package com.leetcode.binaryTree.createBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CreateBinaryTreeFromDescription extends AbstractParent {

    /**
     * Runtime
     * 70
     * ms
     * Beats
     * 46.69%
     * Analyze Complexity
     * Memory
     * 55.34
     * MB
     * Beats
     * 76.49%
     * @param descriptions
     * @return
     */
    @Override
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> childrenSet = new HashSet<>();
        Map<Integer, TreeNode> nodeMap = new HashMap<>();
        TreeNode root = null, child = null;
        for (int i = 0; i < descriptions.length; i++) {
            int[] currDescription = descriptions[i];
            if (nodeMap.containsKey(currDescription[0])) {
                root = nodeMap.get(currDescription[0]);
            } else {
                root = new TreeNode(currDescription[0]);
            }
            if (nodeMap.containsKey(currDescription[1])) {
                child = nodeMap.get(currDescription[1]);
            } else {
                child = new TreeNode(currDescription[1]);
            }
            childrenSet.add(currDescription[1]);
            if (currDescription[2] == 0) {
                root.right = child;
            } else {
                root.left = child;
            }
            nodeMap.put(root.val, root);
            nodeMap.put(child.val, child);
        }
        for (int i = 0; i < descriptions.length; i++) {
            if (!childrenSet.contains(descriptions[i][0])) {
                return nodeMap.get(descriptions[i][0]);
            }
        }
        return null;
    }
}
