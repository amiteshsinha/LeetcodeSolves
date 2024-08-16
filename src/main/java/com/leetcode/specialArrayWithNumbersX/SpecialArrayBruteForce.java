package com.leetcode.specialArrayWithNumbersX;

public class SpecialArrayBruteForce extends AbstractParent {

    @Override
    public int specialArray(int[] nums) {
        int retVal = -1, count;
        for (int j = 1; j <= nums.length; j++) {
            count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0 && nums[i] >= j) {
                    count++;
                }
                if (count > j) {
                    break;
                }
            }
            if (j == count && count > retVal) {
                retVal = count;
            }
        }
        return retVal;
    }
}
