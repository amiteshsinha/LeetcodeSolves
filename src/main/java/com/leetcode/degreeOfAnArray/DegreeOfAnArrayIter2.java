package com.leetcode.degreeOfAnArray;

public class DegreeOfAnArrayIter2 extends AbstractParent {

    /**
     * Runtime
     * 17
     * ms
     * Beats
     * 85.82%
     * Analyze Complexity
     * Memory
     * 56.01
     * MB
     * Beats
     * 5.41%
     * @param nums
     * @return
     */
    @Override
    public int findShortestSubArray(int[] nums) {
        int[] start = new int[500001];
        int[] end = new int[500001];
        int[] freq = new int[500001];
        int maxFreq = 0, temp, minSubArrayLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (start[nums[i]] != 0) {
                freq[nums[i]]++;
                end[nums[i]] = i + 2;
                temp = end[nums[i]] - start[nums[i]];
                if (freq[nums[i]] > maxFreq) {
                    maxFreq = freq[nums[i]];
                    minSubArrayLength = temp;
                } else if (freq[nums[i]] == maxFreq && minSubArrayLength > temp) {
                    minSubArrayLength = temp;
                }
            } else {
                start[nums[i]] = i + 1;
            }
        }
        return minSubArrayLength <= nums.length ? minSubArrayLength : 1;
    }
}
