package com.leetcode.minIncrementToMakeArrUnique;

import java.util.Arrays;

public class MinIncrementToMakeArrUniqueIter1 extends AbstractParent {

    /**
     *Runtime
     * 35
     * ms
     * Beats
     * 82.95%
     * @param nums
     * @return
     */
    @Override
    public int minIncrementForUnique(int[] nums) {
        int counter = 0, previous;
        Arrays.sort(nums);
        previous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= previous) {
                previous++;
                counter += previous - nums[i];
            } else {
                previous = nums[i];
            }
        }
        return counter;
    }
}
