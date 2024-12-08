package com.leetcode.minNoBallsInBag;

/**
 * Runtime
 * 83
 * ms
 * Beats
 * 12.14%
 *
 * Memory
 * 60.16
 * MB
 * Beats
 * 53.64%
 * This file was created on 07/12/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public class minNoBallsInBag extends AbstractParent {

    @Override
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0, mid;
        for (int i : nums) {
            right = Math.max(right, i);
        }
        while (left < right) {
            mid = (left + right) / 2;
            if (isPossible(mid, nums, maxOperations)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isPossible(int mid, int[] nums, int maxOperations) {
        int total = 0;
        for (int i : nums) {
            total += (int)Math.ceil(i/(double)mid) - 1;
            if (total > maxOperations) {
                return false;
            }
        }
        return true;
    }

}
