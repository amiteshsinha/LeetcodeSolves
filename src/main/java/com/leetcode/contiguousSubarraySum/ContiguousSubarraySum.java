package com.leetcode.contiguousSubarraySum;

public class ContiguousSubarraySum extends AbstractParent {

    // time limit exceeded 94 of 99 test cases passed
    @Override
    public boolean checkSubarraySum(int[] nums, int k) {
        int start = 0, window = 2,tempSum = 0, sum = 0;
        for (; window <= nums.length; window++) {
            start = 0;
            int temp = 0;
            int j = window;
            if (window > 2) {
                tempSum += nums[window - 1];
                sum = tempSum;
            } else {
                // reach window length
                while (temp < j && temp < nums.length) {
                    sum += nums[temp];
                    temp++;
                }
                tempSum = sum;
            }
            if (sum % k == 0) {
                return true;
            }
            while (j < nums.length) {
                sum -= nums[start];
                sum += nums[j];
                if (sum % k == 0) {
                    return true;
                }
                start++;
                j++;
            }
        }
        return false;
    }
}
