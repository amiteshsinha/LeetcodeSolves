package com.leetcode.binaryTree.flipEquivalentBinaryTreeps;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.*;

/**
 * The question is whether tree1 CAN be made flip equivalent of tree2 after any number of operations
 *
 * I tried checking whether levels had the same values or not - this is a BAD APPROACH since same node
 * can have different parent in the 2 trees and still come up in the same level
 * This file was created on 24/10/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class FlipEquivalentBinaryTreesBadApproach extends AbstractParent {

    Set<String> path = new HashSet<>();
    @Override
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> levelTraversalTree1 = new LinkedList<>();
        if (root1 != null) {
            levelTraversalTree1.add(root1);
        }
        Queue<TreeNode> levelTraversalTree2 = new LinkedList<>();
        if (root2 != null) {
            levelTraversalTree2.add(root2);
        }
        int level1, level2;
        TreeNode temp1, temp2;
        Set<Integer> tempList = new HashSet<>();
        while (!levelTraversalTree1.isEmpty() || !levelTraversalTree2.isEmpty()) {
            level1 = levelTraversalTree1.size();
            level2 = levelTraversalTree2.size();
            if (level1 != level2) {
                return false;
            }
            tempList.clear();
            for (int i = 0; i < level1; i++) {
                temp1 = levelTraversalTree1.poll();
                tempList.add(temp1.val);
                if (temp1.left != null) {
                    levelTraversalTree1.add(temp1.left);
                }
                if (temp1.right != null) {
                    levelTraversalTree1.add(temp1.right);
                }
            }
            for (int i = 0; i < level2; i++) {
                temp2 = levelTraversalTree2.poll();
                if (!tempList.contains(temp2.val)) {
                    return false;
                }
                if (temp2.left != null) {
                    levelTraversalTree2.add(temp2.left);
                }
                if (temp2.right != null) {
                    levelTraversalTree2.add(temp2.right);
                }
            }
        }
        return true;
    }
}
