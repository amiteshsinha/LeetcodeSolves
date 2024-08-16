package com.leetcode.subsets.noOfBeautifulSubsets;

import java.util.HashSet;
import java.util.Set;

public class NumberOfBeautifulSubsets extends AbstractParent {

    @Override
    public int beautifulSubsets(int[] nums, int k) {
        if (nums.length == 1) {
            return 1;
        }
        int currentSubset , j, retVal = 0;
        double totalCombinations = Math.pow(2, nums.length);
        Set<Integer> diffSet;
        for (int i = 1; i < totalCombinations; i++) {
            currentSubset = i;
            j = 0;
            diffSet = new HashSet<>();
            boolean isValid = true;
            while (currentSubset != 0) {
                if ((currentSubset & 1) != 0) {
                    if (!diffSet.contains(nums[j])) {
                        diffSet.add(k + nums[j]);
                        diffSet.add(nums[j] - k);
                    } else {
                        isValid = false;
                        break;
                    }
                }
                j++;
                currentSubset = currentSubset >> 1;
            }
            if (isValid) {
                retVal++;
            }
        }
        return retVal;
    }
}
