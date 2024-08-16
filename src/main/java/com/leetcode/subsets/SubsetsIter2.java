package com.leetcode.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubsetsIter2 extends AbstractParent {

    @Override
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> retList = new LinkedList<>();
        getSubsetsBackTrack(nums, 0, retList, new ArrayList<>());
        return retList;
    }

    private void getSubsetsBackTrack(int[] nums, int start, List<List<Integer>> retList, List<Integer> tempList) {
        if (start >= nums.length) {
            retList.add(new ArrayList<>(tempList));
            return;
        }
        tempList.add(nums[start]);
        getSubsetsBackTrack(nums, start + 1, retList, tempList);
        tempList.remove(tempList.size() - 1);

        getSubsetsBackTrack(nums, start + 1, retList, tempList);
    }
}
