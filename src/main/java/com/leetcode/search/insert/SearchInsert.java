package com.leetcode.search.insert;

import java.util.Arrays;

public class SearchInsert extends AbstractParent {

    @Override
    public int searchInsert(int[] nums, int target) {
        int temp = Arrays.binarySearch(nums, target);
        return (temp >= 0) ? temp : -1 - temp;
    }
}
