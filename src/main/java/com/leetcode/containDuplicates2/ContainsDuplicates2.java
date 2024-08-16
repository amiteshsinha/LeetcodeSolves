package com.leetcode.containDuplicates2;

import java.util.HashMap;

public class ContainsDuplicates2 extends AbstractParent {

    /**
     * Runtime
     * 20
     * ms
     * Beats
     * 38.98%
     * Analyze Complexity
     * Memory
     * 58.36
     * MB
     * Beats
     * 7.33%
     * @param nums
     * @param k
     * @return
     */
    @Override
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                } else {
                    // last index - current index is greater than k
                    // so we need to update the last index to current index
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
