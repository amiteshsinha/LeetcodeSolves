package com.leetcode.patchingArray;

import java.util.Arrays;

public class PatchingArrayCopy extends AbstractParent {

    // if we have 1 and powers of 2 i.e. - 2,4,,8,16 etc - we can make numbers till 2*max - 1
    // for example with 1,2 we can go till 2*2 - 1 = 3
    // with 1,2,4 we can go till - 2*4 - 1 = 7
    // with 1,2,4,8 we can go till - 2*8 - 1 = 15
    // we can memorize - if we have an existing way of reaching n - k then we only need k more
    // we can also only search for powers of 2 and see if they exist but there can be duplicates in the array
    // input array is sorted so we can do binary search

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 43.58
     * MB
     * Beats
     * 95.47%
     * @param nums
     * @param n
     * @return
     */
    @Override
    public int minPatches(int[] nums, int n) {
        System.out.println(Arrays.toString(nums) + " : range : " + n);
        long missNumber = 1;
        int patchCount = 0;
        int i = 0;
        while (missNumber <= n) {
            // ith no can be used to add
            if (i < nums.length && nums[i] <= missNumber) {
                missNumber += nums[i];
                i++;
            } else {
                System.out.println(missNumber);
                // double the miss number
                missNumber += missNumber;
                patchCount++;
            }
        }
        return patchCount;
    }
}
