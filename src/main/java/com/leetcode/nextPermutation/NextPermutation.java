package com.leetcode.nextPermutation;

import java.util.Arrays;

public class NextPermutation extends AbstractParent {
    //todo fix the code for edge cases
    @Override
    public void nextPermutation(int[] nums) {
        int start = -1 , min = 10, minIndex = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
            if (nums[i - 1] < nums[i]) {
                start = i - 1;
                break;
            }
        }
        if (start == -1) {
            Arrays.sort(nums);
            return;
        }
        // if start is 0 it means that start + 1 is the largest number and we need to swap those
        if (start == 0) {
            int temp = nums[start];
            nums[start] = nums[start + 1];
            nums[start + 1] = temp;
        } else {
            nums[minIndex] = nums[start];
            nums[start] = min;
        }
        Arrays.sort(nums, start + 1, nums.length);
    }
}
