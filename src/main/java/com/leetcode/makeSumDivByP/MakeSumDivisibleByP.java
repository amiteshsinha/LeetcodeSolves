package com.leetcode.makeSumDivByP;

import java.util.HashMap;
import java.util.Map;

/**
 * Runtime
 * 23
 * ms
 * Beats
 * 91.74%
 * <p>
 * Memory
 * 56.56
 * MB
 * Beats
 * 49.54%
 * This file was created on 03/10/24 / Thursday
 */
public class MakeSumDivisibleByP extends AbstractParent {

    @Override
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for (int i : nums) {
            sum = (sum + i) % p;
        }
        int target = sum % p, currSum = 0, minLength = nums.length, needed;
        if (target == 0) {
            return 0;
        }
        Map<Integer, Integer> prefixSumModRemainderMap = new HashMap<>();
        prefixSumModRemainderMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            currSum = (currSum + nums[i]) % p;
            needed = (currSum - target + p) % p;
            if (prefixSumModRemainderMap.containsKey(needed)) {
                minLength = Math.min(minLength, i - prefixSumModRemainderMap.get(needed));
            }
            prefixSumModRemainderMap.put(currSum, i);
        }
        return minLength == nums.length ? -1 : minLength;
    }

}
