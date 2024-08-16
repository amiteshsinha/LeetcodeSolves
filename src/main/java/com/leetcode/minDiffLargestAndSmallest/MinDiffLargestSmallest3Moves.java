package com.leetcode.minDiffLargestAndSmallest;

import java.util.Arrays;

public class MinDiffLargestSmallest3Moves extends AbstractParent {

    @Override
    public int minDifference(int[] nums) {
        if (nums.length < 5) {
            return 0;
        }
        Arrays.sort(nums);
        int j = nums.length - 4, min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++,j++) {
            min = Math.min(nums[j] - nums[i], min);
        }
        return min;
    }
}
