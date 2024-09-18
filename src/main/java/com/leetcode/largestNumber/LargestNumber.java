package com.leetcode.largestNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LargestNumber extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 98.95%
     *
     * Memory
     * 41.88
     * MB
     * Beats
     * 99.13%
     * @param nums
     * @return
     */
    @Override
    public String largestNumber(int[] nums) {
        boolean hasNonZero = false;
        Integer[] integerArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integerArray[i] = nums[i];
            if (nums[i] > 0) {
                hasNonZero = true;
            }
        }
        if (hasNonZero) {
            Arrays.sort(integerArray, new CustomComparator());
            StringBuilder str = new StringBuilder();
            for (int i : integerArray) {
                str.append(i);
            }
            return str.toString();
        } else {
            return "0";
        }
    }

    class CustomComparator<T> implements Comparator<Integer> {

        Map<Integer, char[]> integerMap = new HashMap<>();

        @Override
        public int compare(Integer o1, Integer o2) {
            char[] o1Arr = null, o2Arr = null;
            if (integerMap.containsKey(o1)) {
                o1Arr = integerMap.get(o1);
            } else {
                o1Arr = getIntArr(o1);
                integerMap.put(o1, o1Arr);
            }
            if (integerMap.containsKey(o2)) {
                o2Arr = integerMap.get(o2);
            } else {
                o2Arr = getIntArr(o2);
                integerMap.put(o2, o2Arr);
            }
            int i = 0, j = 0;
            while (i < o1Arr.length && j < o2Arr.length) {
                if (o1Arr[i] > o2Arr[j]) {
                    return -1;
                } else if (o1Arr[i] < o2Arr[j]) {
                    return 1;
                } else {
                    i++;
                    j++;
                    if (i == o1Arr.length) {
                        i = 0;
                    } else if (j == o2Arr.length) {
                        j = 0;
                    }
                }
            }
            return o1Arr.length > o2Arr.length ? 1 : -1;
        }

        private char[] getIntArr(int o2) {
            return String.valueOf(o2).toCharArray();
        }
    }
}
