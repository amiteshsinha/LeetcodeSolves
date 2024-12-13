package com.leetcode.findScoreOfArrayAfterMarking;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Runtime
 * 472
 * ms
 * Beats
 * 5.39%
 *
 * Memory
 * 63.21
 * MB
 * Beats
 * 10.18%
 * This file was created on 13/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class FindScoreOfArrayAfterMarkingElements extends AbstractParent {

    @Override
    public long findScore(int[] nums) {
        long score = 0;
        boolean[] markedArr = new boolean[nums.length];
        PriorityQueue<Node> nodePriorityQueue = new PriorityQueue<>(Comparator.comparing(Node::getVal)
                .thenComparing(Node::getIndex));
        for (int i = 0; i < nums.length; i++) {
            nodePriorityQueue.add(new Node(nums[i], i));
        }
        while (!nodePriorityQueue.isEmpty()) {
            Node curr = nodePriorityQueue.poll();
            if (!markedArr[curr.index]) {
                score += curr.val;
                markedArr[curr.index] = true;
                if (curr.index > 0) {
                    markedArr[curr.index - 1] = true;
                }
                if (curr.index < nums.length - 1) {
                    markedArr[curr.index + 1] = true;
                }
            }
        }
        return score;
    }

    class Node {
        int val;
        int index;

        public Node(int val, int index) {
            this.val = val;
            this.index = index;
        }

        public int getVal() {
            return val;
        }

        public int getIndex() {
            return index;
        }
    }

}
