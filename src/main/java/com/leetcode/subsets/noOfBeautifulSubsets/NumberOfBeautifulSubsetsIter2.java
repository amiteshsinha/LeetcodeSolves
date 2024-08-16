package com.leetcode.subsets.noOfBeautifulSubsets;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfBeautifulSubsetsIter2 extends AbstractParent {

    int retVal;
    @Override
    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        getBeautifulSubsetsBacktrack(nums, k , 0, new HashMap<Integer, Integer>());
        return --retVal;
    }

    private void getBeautifulSubsetsBacktrack(int[] nums, int k, int index, Map<Integer, Integer> existingNums) {
        retVal++;
        for (int i = index; i < nums.length; i++) {
            if (!existingNums.containsKey(nums[i] - k)) {
                existingNums.put(nums[i], existingNums.getOrDefault(nums[i], 0) + 1);
                getBeautifulSubsetsBacktrack(nums, k, i + 1, existingNums);
                existingNums.put(nums[i], existingNums.get(nums[i]) - 1);
                if (existingNums.get(nums[i]) == 0) {
                    existingNums.remove(nums[i]);
                }
            }
        }
    }
}
