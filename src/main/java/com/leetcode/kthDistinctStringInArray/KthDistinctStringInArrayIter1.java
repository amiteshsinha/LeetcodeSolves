package com.leetcode.kthDistinctStringInArray;

import java.util.HashSet;
import java.util.Set;

public class KthDistinctStringInArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 44.51
     * MB
     * Beats
     * 11.44%
     * @param arr
     * @param k
     * @return
     */
    @Override
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinctSet = new HashSet<>();
        Set<String> nonDistinct = new HashSet<>();
        for (String str : arr) {
            if (distinctSet.contains(str)) {
                nonDistinct.add(str);
            } else {
                distinctSet.add(str);
            }
        }
        int temp = 0;
        for (String str : arr) {
            if (!nonDistinct.contains(str)) {
                temp++;
            }
            if (temp == k) {
                return str;
            }
        }
        return "";
    }
}
