package com.leetcode.divideArrayKConsecutive;

import java.util.TreeMap;

public class DivideArrayIntoKSizeConsecutiveWithMap extends AbstractDivideArray {

    @Override
    boolean isPossibleDivide(int[] nums, int k) {
        if (nums == null || nums.length % k != 0) {
            return false;
        }
        TreeMap<Integer, Integer> aMap = new TreeMap<>();
        for (Integer number : nums) {
            aMap.put(number, aMap.getOrDefault(number, 0) + 1);
        }
        while (aMap.size() > 0) {
            int first = aMap.firstKey();
            for (int no = first; no < first + k; no++) {
                if (!aMap.containsKey(no)) {
                    return false;
                }
                int count = aMap.get(no);
                if (count == 1) {
                    aMap.remove(no);
                } else {
                    aMap.put(no, count - 1);
                }
            }
        }
        return true;
    }
}
