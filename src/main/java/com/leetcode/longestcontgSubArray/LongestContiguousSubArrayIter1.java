package com.leetcode.longestcontgSubArray;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestContiguousSubArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 27
     * ms
     * Beats
     * 90.95%
     *
     * Memory
     * 56.14
     * MB
     * Beats
     * 79.31%
     * @param nums
     * @param limit
     * @return
     */
    @Override
    public int longestSubarray(int[] nums, int limit) {
        int count = 1, length = nums.length, i = 0, j;
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        for (j = 0; j < length; j++) {
            while (!maxDeque.isEmpty() && maxDeque.peekLast() < nums[j]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(nums[j]);
            while (!minDeque.isEmpty() && minDeque.peekLast() > nums[j]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(nums[j]);
            while (maxDeque.peekFirst() - minDeque.peekFirst() > limit) {
                if (maxDeque.peekFirst() == nums[i]) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() == nums[i]) {
                    minDeque.pollFirst();
                }
                i++;
            }
            count = Math.max(j - i  + 1, count);
        }
        return count;
    }
}
