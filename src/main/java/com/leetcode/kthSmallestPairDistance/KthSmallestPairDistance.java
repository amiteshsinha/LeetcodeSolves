package com.leetcode.kthSmallestPairDistance;

import java.util.Arrays;

public class KthSmallestPairDistance extends AbstractParent {

    // wrong approach - need to find all distance combinations and then figure out kth smallest
    @Override
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int length = nums.length - 1, index = 0;
        while (k > length) {
            k -= length;
            length--;
            index++;
        }
        return Math.abs(nums[index] - nums[k + index]);
    }
}
