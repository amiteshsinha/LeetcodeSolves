package com.leetcode.threesum.allval;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum extends AbstractThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> ValueAndIndexMap = new HashMap<>();
        Set<List<Integer>> tempSet = new HashSet<>();
        List<List<Integer>> retList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = 0 - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int k = sum - nums[j];
                if (ValueAndIndexMap.keySet().contains(k) && i != j && ValueAndIndexMap.get(k) != i && ValueAndIndexMap.get(k) != j) {
                    List<Integer> temp = new LinkedList<>(Arrays.asList(nums[i], nums[j], k));
                    Collections.sort(temp);
                    if (tempSet.contains(temp)) {
                        continue;
                    } else {
                        tempSet.add(temp);
                        retList.add(temp);
                    }
                }
                ValueAndIndexMap.put(nums[j], j);
            }
        }
        return retList;
    }
}
