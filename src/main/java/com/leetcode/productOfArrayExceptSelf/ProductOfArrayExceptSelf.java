package com.leetcode.productOfArrayExceptSelf;

public class ProductOfArrayExceptSelf extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 87.48%
     *
     * Memory
     * 55.48
     * MB
     * Beats
     * 48.30%
     * @param nums
     * @return
     */
    @Override
    public int[] productExceptSelf(int[] nums) {
        // initial thought - create 2 additional arrays one for prefix product one for suffix product
        // now going through the array multiply left and right of each to get final val
        int[] prefixArr = new int[nums.length + 1];
        prefixArr[0] = 1;
        int[] suffixArr = new int[nums.length + 1];
        suffixArr[nums.length] = 1;
        int[] retArr = new int[nums.length];
        for (int i = 1; i <= nums.length; i++) {
            prefixArr[i] = prefixArr[i -1]*nums[i - 1];
        }
        for (int i = nums.length - 1; i > - 1; i--) {
            suffixArr[i] = suffixArr[i + 1]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            retArr[i] = prefixArr[i]*suffixArr[i + 1];
        }
        return retArr;
    }
}
