package com.leetcode.longestcontgSubArray;

import java.util.TreeMap;

public class LongestContiguousSubArray extends AbstractParent {

    /**
     * Runtime
     * 59
     * ms
     * Beats
     * 41.80%
     *
     * Memory
     * 55.34
     * MB
     * Beats
     * 90.34%
     * @param nums
     * @param limit
     * @return
     */
    @Override
    public int longestSubarray(int[] nums, int limit) {
        int count = 1, length = nums.length, i = 0, j = 0, temp;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        while (j < length && i <= j) {
            treeMap.put(nums[j], treeMap.getOrDefault(nums[j], 0) + 1);
            while (treeMap.lastKey() - treeMap.firstKey() > limit) {
                temp = treeMap.get(nums[i]);
                if (temp > 1) {
                    treeMap.put(nums[i], temp - 1);
                } else {
                    treeMap.remove(nums[i]);
                }
                i++;
            }
            count = Math.max(j - i + 1, count);
            j++;
        }
        return count;
    }
}
