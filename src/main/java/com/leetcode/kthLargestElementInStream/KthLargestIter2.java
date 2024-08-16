package com.leetcode.kthLargestElementInStream;

import java.util.PriorityQueue;

/**
 * Runtime
 * 12
 * ms
 * Beats
 * 96.69%
 * Analyze Complexity
 * Memory
 * 47.50
 * MB
 * Beats
 * 9.34%
 */
public class KthLargestIter2 {

    PriorityQueue<Integer> queue;
    int k;

    public KthLargestIter2(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>();
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (k > queue.size() || val > queue.peek()) {
            queue.offer(val);
            if (queue.size() > k) {
                queue.remove();
            }
        }
        return queue.peek();
    }
}
