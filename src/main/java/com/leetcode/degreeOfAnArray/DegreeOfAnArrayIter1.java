package com.leetcode.degreeOfAnArray;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 27
     * ms
     * Beats
     * 47.01%
     *
     * Memory
     * 48.56
     * MB
     * Beats
     * 18.47%
     * @param nums
     * @return
     */
    @Override
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> startMap = new HashMap<>();
        Map<Integer, Integer> endMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0, tempFreq, minSubArrayLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (startMap.containsKey(nums[i])) {
                tempFreq = freqMap.getOrDefault(nums[i], 0) + 1;
                freqMap.put(nums[i], tempFreq);
                endMap.put(nums[i], i);
                if (tempFreq > maxFreq) {
                    maxFreq = tempFreq;
                    minSubArrayLength = endMap.get(nums[i]) - startMap.get(nums[i]);
                } else if (tempFreq == maxFreq) {
                    tempFreq = endMap.get(nums[i]) - startMap.get(nums[i]);
                    if (minSubArrayLength > tempFreq) {
                        minSubArrayLength = tempFreq;
                    }
                }
            } else {
                startMap.put(nums[i], i);
            }
        }
        return minSubArrayLength < nums.length ? minSubArrayLength + 1 : 1;
    }
}
