package com.leetcode.finalArrayStateAfterKMultiplications;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Runtime
 * 3
 * ms
 * Beats
 * 33.80%
 *
 * Memory
 * 44.56
 * MB
 * Beats
 * 89.91%
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class FinalArrayKAfterKMultiplications extends AbstractParent {

    @Override
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0 ; i < nums.length; i++) {
            queue.add(new int[]{nums[i], i});
        }
        for (;k != 0; k--) {
            int[] arr = queue.poll();
            arr[0] *= multiplier;
            queue.add(arr);
        }
        for (int[] arr : queue) {
            nums[arr[1]] = arr[0];
        }
        return nums;
    }

}
