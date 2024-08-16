package com.leetcode.singleNumber;

public class SingleNumber extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.91%
     *
     * Memory
     * 45.59
     * MB
     * Beats
     * 80.21%
     * @param nums
     * @return
     */
    @Override
    public int singleNumber(int[] nums) {
        int ans =0;
        for (int i : nums) {
            ans ^= i;
        }
        return ans;
    }
}
