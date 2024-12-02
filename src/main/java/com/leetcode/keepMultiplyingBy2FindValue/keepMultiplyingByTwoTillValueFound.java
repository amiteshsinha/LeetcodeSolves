package com.leetcode.keepMultiplyingBy2FindValue;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 44.02
 * MB
 * Beats
 * 63.82%
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class keepMultiplyingByTwoTillValueFound extends AbstractParent {

    @Override
    public int findFinalValue(int[] nums, int original) {
        boolean[] presentArr = new boolean[1001];
        for (int num : nums) {
            presentArr[num] = true;
        }
        int i;
        for (i = original; i < presentArr.length; i = i*2) {
            if (i > presentArr.length || !presentArr[i]) {
                return i;
            }
        }
        return i;
    }

}
