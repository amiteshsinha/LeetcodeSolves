package com.leetcode.binaryTree.cousinsInBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * This file was created on 23/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class CousinsInBinaryTreeIter1 extends AbstractParent {

    @Override
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        List<TreeNode> parentList = new ArrayList<>();
        nodeQueue.add(root);
        boolean isXOrYFound = false;
        int nodesInlevel, level = 0;
        while (!nodeQueue.isEmpty()) {
            nodesInlevel = nodeQueue.size();
            isXOrYFound = false;
            level++;
            for (int i = 0; i < nodesInlevel; i++) {
                TreeNode temp = nodeQueue.poll();
                if (temp.val == x || temp.val == y) {
                    if (isXOrYFound) {// check in the same list if y is present - comes to this if - if both are present
                        // if it is present check whether their parents are same or different
                        if (parentList.size() <= 1) {
                            return false;
                        } else if (parentList.get(0).val == parentList.get(1).val) {
                            return false;
                        }
                        return true;
                    } else {
                        isXOrYFound = true;
                    }
                }
                if (temp.left != null) {
                    if (temp.left.val == x || temp.left.val == y) {
                        parentList.add(temp);
                    }
                    nodeQueue.add(temp.left);
                }
                if (temp.right != null) {
                    if (temp.right.val == x || temp.right.val == y) {
                        parentList.add(temp);
                    }
                    nodeQueue.add(temp.right);
                }
            }
        }
        return false;
    }
}
