package com.leetcode.maxChunkToMakeSorted;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 40.86
 * MB
 * Beats
 * 62.41%
 * This file was created on 19/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class MaxChunkToMakeSorted extends AbstractParent {

    // All elements are unique
    // elements are in the range of 1 - n and n is max 10
    // sliding window - till the moment its strictly decreasing
    public int maxChunksToSorted(int[] arr) {
        int retVal = 0, sum = 0, i = 0, j;
        while (i < arr.length) {
            j = i;
            do {
                sum += arr[j];
                j++;
            } while (j < arr.length && sum != j * (j - 1) / 2);
            retVal++;
            while (j < arr.length && sum == j * (j - 1) / 2) {
                sum += arr[j];
                j++;
                retVal++;
            }
            i = j;
            if (i < arr.length) {
                retVal--;
            } else {
                break;
            }
        }
        return retVal;
    }
}
