package com.leetcode.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubsetsIter1 extends AbstractParent {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> retList = new LinkedList<>();
        getSubsetsBackTrack(nums, 0, retList, new ArrayList<>());
        return retList;
    }

    private void getSubsetsBackTrack(int[] nums, int start, List<List<Integer>> retList, List<Integer> tempList) {
        retList.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            getSubsetsBackTrack(nums, i + 1, retList, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }
}
