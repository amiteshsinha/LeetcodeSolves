package com.leetcode.threesum.closest;

import java.util.Arrays;

import static java.lang.Math.abs;

public class ThreeSumClosest extends AbstractThreeSumClosest {

    @Override
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to enable two-pointer approach
        Arrays.sort(nums);
        // Initialize minDiff to a large value
        int minDiffSoFar = Integer.MAX_VALUE, closestSum = 0;
        for (int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i+1, hi = nums.length-1;
                while (lo < hi) {
                    // Calculate theS current sum
                    int currentSum = nums[i] + nums[lo] + nums[hi];
                    // Calculate the absolute difference between current sum and target
                    int k = abs(target - currentSum);
                    if (k < minDiffSoFar) {
                        // Update the minimum difference and closest sum if necessary
                        minDiffSoFar = k;
                        closestSum = currentSum;
                    }
                    if (currentSum < target) {
                        lo++;// If current sum is less than target, increment the left pointer
                    } else if (currentSum > target) {
                        hi--;// If current sum is more than target, decrement the right pointer
                    } else {
                        return currentSum;// If current sum is equal to target, return it as the closest sum
                    }
                }
            }
        }
        return closestSum;
    }
}
