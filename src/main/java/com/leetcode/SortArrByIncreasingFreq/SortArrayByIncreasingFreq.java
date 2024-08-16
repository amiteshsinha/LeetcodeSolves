package com.leetcode.SortArrByIncreasingFreq;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayByIncreasingFreq extends AbstractParent {

    /**
     * Runtime
     * 14
     * ms
     * Beats
     * 5.22%
     * Analyze Complexity
     * Memory
     * 44.53
     * MB
     * Beats
     * 34.87%
     *
     * @param nums
     * @return
     */
    @Override
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Comparator<Map.Entry<Integer, Integer>> compareVal = Map.Entry.comparingByValue();
        Map<Integer, Integer> sortedMap = map.entrySet()
                        .stream()
                        .sorted(compareVal.thenComparing(Map.Entry.comparingByKey(Comparator.reverseOrder())))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old1, old2) -> old1, LinkedHashMap::new));
        int i = 0, freq = 0;
        for (Integer key : sortedMap.keySet()) {
            freq = sortedMap.get(key);
            for (int j = 0; j < freq; j++) {
                nums[i] = key;
                i++;
            }
        }
        return nums;
    }
}
