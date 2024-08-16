package com.leetcode.degreeOfAnArray;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray extends AbstractParent {

    /**
     * Runtime
     * 51
     * ms
     * Beats
     * 15.67%
     * Analyze Complexity
     * Memory
     * 53.81
     * MB
     * Beats
     * 5.41%
     * @param nums
     * @return
     */
    @Override
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> startMap = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> endMap = new HashMap<>();
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 1, tempFreq, valMax = nums[0], minSubArrayLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (startMap.containsKey(nums[i])) {
                tempFreq = freqMap.getOrDefault(nums[i], 0);
                if (endMap.containsKey(tempFreq)) {
                    endMap.get(tempFreq).remove(nums[i]);
                }
                tempFreq++;
                freqMap.put(nums[i], tempFreq);
                endMap.computeIfAbsent(tempFreq, k -> new HashMap<>()).put(nums[i], i);
                if (tempFreq >= maxFreq) {
                    maxFreq = tempFreq;
                    valMax = nums[i];
                    minSubArrayLength = endMap.get(maxFreq).get(valMax) - startMap.get(valMax);
                }
            } else {
                startMap.put(nums[i], i);
            }
        }
        Map<Integer, Integer> maxIndexMap = endMap.get(maxFreq);
        if (maxIndexMap != null) {
            for (Integer key : maxIndexMap.keySet()) {
                tempFreq = maxIndexMap.get(key) - startMap.get(key);
                if (minSubArrayLength > tempFreq) {
                    minSubArrayLength = tempFreq;
                }
            }
        }
        return minSubArrayLength + 1;
    }
}
