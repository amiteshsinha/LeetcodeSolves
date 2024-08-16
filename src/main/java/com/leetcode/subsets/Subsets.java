package com.leetcode.subsets;

import java.util.LinkedList;
import java.util.List;

public class Subsets extends AbstractParent {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        int k , j;
        double totalCombinations = Math.pow(2, nums.length);
        List<List<Integer>> retList = new LinkedList<>();
        retList.add(new LinkedList<>());
        for (int i = 1; i < totalCombinations; i++) {
            k = i;
            j = 0;
            List<Integer> list = new LinkedList<>();
            while (k != 0) {
                if ((k & 1) != 0) {
                    list.add(nums[j]);
                }
                j++;
                k = k >> 1;
            }
            retList.add(list);
        }
        return retList;
    }
}
