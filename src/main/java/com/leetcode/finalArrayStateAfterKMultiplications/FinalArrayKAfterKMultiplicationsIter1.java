package com.leetcode.finalArrayStateAfterKMultiplications;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 44.12
 * MB
 * Beats
 * 99.12%
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class FinalArrayKAfterKMultiplicationsIter1 extends AbstractParent {

    @Override
    public int[] getFinalState(int[] nums, int k, int multiplier) {
       int x;
        while (k > 0) {
            x = 0;
          for (int i = 0 ; i < nums.length; i++) {
              if (nums[x] > nums[i]) {
                  x = i;
              }
          }
          nums[x] = nums[x]*multiplier;
          k--;
       }
        return nums;
    }

}
