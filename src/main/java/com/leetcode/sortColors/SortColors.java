package com.leetcode.sortColors;

public class SortColors extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.60
     * MB
     * Beats
     * 77.63%
     * of users with Java
     * @param nums
     */
    @Override
    public void sortColors(int[] nums) {
        int[] freqArr = new int[3];
        int j = 0;
        for (int i = 0; i < nums.length;i++) {
            freqArr[nums[i]]++;
        }
        for (int i = 0; i < 3; i++) {
            while (freqArr[i] != 0) {
                nums[j] = i;
                j++;
                freqArr[i]--;
            }
        }
    }
}
