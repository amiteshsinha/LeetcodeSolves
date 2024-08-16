package com.leetcode.largestIntegerPair;

import java.util.Arrays;

public class LargestIntegerPair extends AbstractParent {

    @Override
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, k = 0;
        while (i < j && nums[i] < 0) {
            k = -nums[i];
            if (k == nums[j]) {
                return k;
            } else {
                if (k < nums[j]) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return -1;
    }
}
