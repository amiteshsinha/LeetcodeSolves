package com.leetcode.subsets.noOfBeautifulSubsets;

import java.util.HashMap;
import java.util.Map;

public class NumberOfBeautifulSubsetsIter1 extends AbstractParent {

    int retVal;
    @Override
    public int beautifulSubsets(int[] nums, int k) {
        getBeautifulSubsetsBacktrack(nums, k , 0, new HashMap<Integer, Integer>());
        return --retVal;
    }

    private void getBeautifulSubsetsBacktrack(int[] nums, int k, int index, Map<Integer, Integer> existingNums) {
        retVal++;
        for (int i = index; i < nums.length; i++) {
            if (!existingNums.containsKey(nums[i])) {
                existingNums.put((k + nums[i]), existingNums.getOrDefault(k + nums[i], 0) + 1);
                existingNums.put((nums[i] - k), existingNums.getOrDefault(nums[i] - k, 0) + 1);
                getBeautifulSubsetsBacktrack(nums, k, i + 1, existingNums);
                remove(existingNums,k + nums[i]);
                remove(existingNums,nums[i] - k);
            }
        }
    }

    private void remove(Map<Integer, Integer> map, Integer k) {
        if (map.containsKey(k)) {
            int j = map.get(k) - 1;
            if (j > 0) {
                map.put(k, j);
            } else {
                map.remove(k);
            }
        }
    }
}
