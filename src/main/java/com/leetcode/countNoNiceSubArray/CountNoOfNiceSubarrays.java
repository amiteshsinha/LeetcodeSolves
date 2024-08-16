package com.leetcode.countNoNiceSubArray;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfNiceSubarrays extends AbstractParent {

    @Override
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, subArray =0;
        Map<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0 , 1);
        for (int i = 0; i < nums.length; i++) {
            count  += nums[i] % 2;
            if (prefixMap.containsKey(count - k)) {
                subArray += prefixMap.get(count - k);
            }
            prefixMap.put(count, prefixMap.getOrDefault(count, 0) + 1);
        }
        return subArray;
    }
}
