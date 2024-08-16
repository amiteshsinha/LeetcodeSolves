package com.leetcode.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement extends AbstractParent {

    /**
     * Fastest
     * Runtime
     * 10
     * ms
     * Beats
     * 37.56%
     *
     * Memory
     * 50.00
     * MB
     * Beats
     * 70.04%
     * @param nums
     * @return
     */
    @Override
    public int majorityElement(int[] nums) {
        int border = nums.length/2, curr;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer k : nums) {
            curr = countMap.getOrDefault(k, 0) + 1;
            if (curr > border) {
                return k;
            }
            countMap.put(k, curr);
        }
        return 0;
    }
}
