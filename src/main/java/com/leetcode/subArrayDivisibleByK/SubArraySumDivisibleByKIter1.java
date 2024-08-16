package com.leetcode.subArrayDivisibleByK;

public class SubArraySumDivisibleByKIter1 extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 99.31%
     * of users with Java
     * Memory
     * 45.98
     * MB
     * Beats
     * 85.93%
     * of users with Java
     * @param nums
     * @param k
     * @return
     */
    @Override
    public int subarraysDivByK(int[] nums, int k) {
        int runningSum = 0;
        int remainder;
        int count = 0;
        int[] freqArr = new int[k];
        freqArr[0] = 1;
        for (int i = 0 ; i < nums.length; i++) {
            runningSum += nums[i];
            remainder = runningSum%k;
            if (remainder < 0) {
                remainder += k;
            }
            count += freqArr[remainder];
            freqArr[remainder]++;
        }
        return count;
    }
}
