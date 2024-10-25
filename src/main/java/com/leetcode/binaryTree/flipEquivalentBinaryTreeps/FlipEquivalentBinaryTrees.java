package com.leetcode.binaryTree.flipEquivalentBinaryTreeps;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.*;

/**
 * Runtime
 * 2
 * ms
 * Beats
 * 5.97%
 *
 * Memory
 * 41.98
 * MB
 * Beats
 * 8.36%
 * The question is whether tree1 CAN be made flip equivalent of tree2 after any number of operations
 *
 * Approach - DFS - find path of all leaf nodes and store it in a set for both roots.
 * Now compare the 2 sets. If they have the exact same paths then the flip is possible and we return true
 * false otherwise
 *
 * This file was created on 24/10/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class FlipEquivalentBinaryTrees extends AbstractParent {

    @Override
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        //for every node we need to find the path - if the path matches with root2 path then we can flip
        Set<String> set1 = new HashSet<>();
        dfs(root1, new ArrayList<>(), set1);
        Set<String> set2 = new HashSet<>();
        dfs(root2,  new ArrayList<>(), set2);
        for (String s : set1) {
            if (!set2.contains(s)) {
                return false;
            } else {
                set2.remove(s);
            }
        }
        return set2.isEmpty();
    }

    private void dfs(TreeNode root1, List<Integer> pathList, Set<String> set) {
        if (root1 == null) {
            return;
        }
        pathList.add(root1.val);
        if (root1.left == null && root1.right == null) {
            set.add(pathList.toString());
        }
        if (root1.left != null) {
            dfs(root1.left, pathList, set);
        }
        if (root1.right != null) {
            dfs(root1.right, pathList, set);
        }
        pathList.remove(pathList.size() - 1);
    }
}
