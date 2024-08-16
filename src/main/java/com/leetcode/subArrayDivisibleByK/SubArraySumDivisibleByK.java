package com.leetcode.subArrayDivisibleByK;

public class SubArraySumDivisibleByK extends AbstractParent {

    /**
     * time limit exceeded
     * @param nums
     * @param k
     * @return
     */
    @Override
    public int subarraysDivByK(int[] nums, int k) {

        int start = 0, tempSum = 0, sum = 0, count = 0;
        for (int window = 1; window <= nums.length; window++) {
            start = 0;
            int temp = 0;
            int j = window;
            if (window > 1) {
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
                count++;
            }
            while (j < nums.length) {
                sum -= nums[start];
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
                start++;
                j++;
            }
        }
        return count;
    }
}
