package com.leetcode.productOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelfWithoutAddSpace extends AbstractParent {

    /**
     * @param nums
     * @return
     */
    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] retArr = new int[nums.length];
        Arrays.fill(retArr, 1);
        int curr = 1;
        for (int i = 0; i < nums.length; i++) {
            retArr[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for (int i = nums.length - 1; i > - 1; i--) {
            retArr[i] *= curr;
            curr *= nums[i];
        }
        return retArr;
    }
}
