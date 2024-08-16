package com.leetcode.binaryTree.minDepthBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthBinaryTreeIter1 extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 91.42%
     * of users with Java
     * Memory
     * 62.70
     * MB
     * Beats
     * 92.18%
     * of users with Java
     * @param root
     * @return
     */
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int retVal = 1, queSize = 0;
        while (!queue.isEmpty()) {
            queSize = queue.size();
            while (queSize > 0) {
                TreeNode node = queue.poll();
                queSize--;
                if (node.left == null && node.right == null) {
                    return retVal;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            retVal++;
        }
        return retVal;
    }
}
