package com.leetcode.minIncrementToMakeArrUnique;

import java.util.HashSet;
import java.util.Set;

public class MinIncrementToMakeArrUnique extends AbstractParent {

    /**
     * time limit exceeded
     * @param nums
     * @return
     */
    @Override
    public int minIncrementForUnique(int[] nums) {
        int counter = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            while (set.contains(i)) {
                i++;
                counter++;
            }
            set.add(i);
        }
        return counter;
    }
}
