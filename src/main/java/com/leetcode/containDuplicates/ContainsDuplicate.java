package com.leetcode.containDuplicates;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 99.37%
     * Analyze Complexity
     * Memory
     * 60.27
     * MB
     * Beats
     * 30.30%
     * @param nums
     * @return
     */
    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {//set.add returns false if it already contains the number
                return true;
            }
        }
        return false;
    }
}
