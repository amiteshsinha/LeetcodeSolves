package com.leetcode.subarrayWithMaxAnd;

public class SubArrayWithMaxAnd extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 58.97
     * MB
     * Beats
     * 95.51%
     * @param nums
     * @return
     */
    @Override
    public int longestSubarray(int[] nums) {
        int max = 1, count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                count++;
            } else if (nums[i] < max) {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
                continue;
            } else {
                count = 1;
                maxCount = 1;
                max = nums[i];
            }
        }
        return (count > maxCount) ? count : maxCount;
    }
}
