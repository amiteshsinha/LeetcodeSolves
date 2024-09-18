package com.leetcode.largestNumber;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LargestNumberIter1 extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 98.95%
     *
     * Memory
     * 41.60
     * MB
     * Beats
     * 99.79%
     * @param nums
     * @return
     */
    @Override
    public String largestNumber(int[] nums) {
        Integer[] integerArray = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            integerArray[i] = nums[i];
        }
        Arrays.sort(integerArray, new CustomComparator());
        StringBuilder str = new StringBuilder();
        for (int i : integerArray) {
            str.append(i);
        }
        return str.charAt(0) == '0' ? "0" : str.toString();
    }

    class CustomComparator<T> implements Comparator<Integer> {

        Map<Integer, Long> integerMap = new HashMap<>();

        @Override
        public int compare(Integer o1, Integer o2) {
            long o1Length = 10, o2Length = 10;
            if (integerMap.containsKey(o1)) {
                o1Length = integerMap.get(o1);
            } else {
                while (o1 >= o1Length) {
                    o1Length *= 10;
                }
                integerMap.put(o1, o1Length);
            }
            if (integerMap.containsKey(o2)) {
                o2Length = integerMap.get(o2);
            } else {
                while (o2 >= o2Length) {
                    o2Length *= 10;
                }
                integerMap.put(o2, o2Length);
            }
            long l = o1*o2Length + o2;
            long r = o2*o1Length + o1;
            return (l > r) ? -1 : 1;
        }
    }
}
