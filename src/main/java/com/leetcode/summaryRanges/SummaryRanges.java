package com.leetcode.summaryRanges;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.48
     * MB
     * Beats
     * 82.38%
     * @param nums
     * @return
     */
    @Override
    public List<String> summaryRanges(int[] nums) {
        int start = 0, count = 1;
        List<String> retList = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return retList;
        }
        for (int end = 1; end < nums.length;end++) {
            if (nums[end] == nums[start] + count) {
                count++;
            } else {
                if (count == 1) {
                    retList.add(nums[start] + "");
                } else {
                    retList.add(new StringBuilder()
                            .append(nums[start])
                            .append("->")
                            .append(nums[end - 1])
                            .toString());
                }
                count = 1;
                start = end;
            }
        }
        if (count == 1) {
            retList.add(nums[start] + "");
        } else {
            retList.add(new StringBuilder()
                    .append(nums[start])
                    .append("->")
                    .append(nums[nums.length - 1])
                    .toString());
        }
        return retList;
    }
}
