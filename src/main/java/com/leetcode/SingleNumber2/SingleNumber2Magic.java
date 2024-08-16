package com.leetcode.SingleNumber2;

public class SingleNumber2Magic extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 45.19
     * MB
     * Beats
     * 66.88%
     * @param nums
     * @return
     */
    @Override
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (int i : nums) {
           ones ^= (i & ~twos);
           twos ^= (i & ~ones);
        }
        return ones;
    }
}
