package com.leetcode.specialArrayWithNumbersX;

public class SpecialArray extends AbstractParent {

    @Override
    public int specialArray(int[] nums) {
        int count = 0;
        int length = nums.length;
        int[] maxArr = new int[length + 1];
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
               if (nums[i] > length) {
                   maxArr[length]++;
               } else {
                   maxArr[nums[i]]++;
               }
            }
        }
        // start from the right and figure out what is the min number
        for (int j = length; j > 0; j--) {
            count += maxArr[j];
            if (count > j) {
                return -1;
            }
            if (count == j) {
                return count;
            }
        }
        return -1;
    }
}
