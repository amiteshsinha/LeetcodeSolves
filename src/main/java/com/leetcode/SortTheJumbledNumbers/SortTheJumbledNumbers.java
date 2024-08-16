package com.leetcode.SortTheJumbledNumbers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheJumbledNumbers extends AbstractParent {

    @Override
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int temp;
        for (int i : nums) {
            temp = computeNumber(mapping, i);
            //System.out.println("computed no " + temp + " for org " + i);
            map.computeIfAbsent(temp, k -> new LinkedList<>()).add(i);
        }
        List<Integer> sortedList = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getKey)
                        .collect(Collectors.toList());
       temp = 0;
        for (Integer i : sortedList) {
            for (Integer j : map.get(i)) {
                nums[temp] = j;
                temp++;
            }
        }
        return nums;
    }

    private int computeNumber(int[] mapping, int i) {
        if (i == 0) {
            return mapping[0];
        }
        int temp = 0, retVal = 0, multiplier = 1;
        while (i > 0) {
            temp = i % 10;
            retVal += mapping[temp]*multiplier;
            multiplier *= 10;
            i = i/10;
        }
        return retVal;
    }
}
