package com.leetcode.squaresOfSortedArray;

public class SquaresOfSortedArray extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 47.34
     * MB
     * Beats
     * 21.08%
     * of users with Java
     * @param nums
     * @return
     */
    @Override
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int j = 0, k = length - 1;
        int[] retArr = new int[length];
        for (int i = k; i >= 0; i--) {
            if (Math.abs(nums[j]) > Math.abs(nums[k])) {
                retArr[i] = nums[j]*nums[j];
                j++;
            } else {
                retArr[i] = nums[k]*nums[k];
                k--;
            }

        }
        return retArr;
    }
}
