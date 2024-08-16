package com.leetcode.kthDistinctStringInArray;

import java.util.LinkedHashMap;
import java.util.Map;

public class KthDistinctStringInArray extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 91.98%
     * Analyze Complexity
     * Memory
     * 43.91
     * MB
     * Beats
     * 78.50%
     * @param arr
     * @param k
     * @return
     */
    @Override
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> orderedMap = new LinkedHashMap<>();
        for (String str : arr) {
            orderedMap.put(str, orderedMap.getOrDefault(str, 0) + 1);
        }
        int temp = 0;
        for (Map.Entry<String, Integer> entry : orderedMap.entrySet()) {
            if (entry.getValue() == 1) {
                temp++;
            }
            if (temp == k) {
                return entry.getKey();
            }
        }
        return "";
    }
}
