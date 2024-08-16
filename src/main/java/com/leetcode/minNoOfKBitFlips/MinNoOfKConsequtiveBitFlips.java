package com.leetcode.minNoOfKBitFlips;

public class MinNoOfKConsequtiveBitFlips extends AbstractParent {

    /**
     * Runtime
     * 5
     * ms
     * Beats
     * 88.39%
     *
     * Memory
     * 54.48
     * MB
     * Beats
     * 99.35%
     * @param nums
     * @param k
     * @return
     */
    @Override
    public int minKBitFlips(int[] nums, int k) {
        int currFlips = 0, retFlips = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k && nums[i -k] == 2) {
                currFlips--;
            }
            if (currFlips %2 == nums[i]) {
                if (i + k > nums.length) {
                    return -1;
                }
                nums[i] = 2;
                currFlips++;
                retFlips++;
            }
        }
        return retFlips;
    }
}
