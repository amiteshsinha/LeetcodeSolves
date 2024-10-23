package com.leetcode.binaryTree.kthLargestSumPerLevelBinaryTree;

import com.amitesh.core.baseclass.TreeNode.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Runtime
 * 18
 * ms
 * Beats
 * 94.63%
 *
 * Memory
 * 62.86
 * MB
 * Beats
 * 57.77%
 * This file was created on 22/10/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class KthLargestSumPerLevelBTree extends AbstractParent {

    @Override
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
        long sum = 0;
        int level;
        while (!nodeList.isEmpty()) {
            level = nodeList.size();
            sum = 0;
            for (int i = 0; i < level; i++) {
                TreeNode poppedNode = nodeList.poll();
                sum += poppedNode.val;
                if (poppedNode.left != null) {
                    //add left child
                    nodeList.add(poppedNode.left);
                }
                if (poppedNode.right != null) {
                    // add right child
                    nodeList.add(poppedNode.right);
                }
            }
            queue.add(sum);
        }
        if (queue.size() < k) {
            return -1;
        }
        while (k != 0) {
            sum = queue.poll();
            k--;
        }
        return sum;
    }

}
