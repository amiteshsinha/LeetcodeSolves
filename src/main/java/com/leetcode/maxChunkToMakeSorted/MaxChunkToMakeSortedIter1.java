package com.leetcode.maxChunkToMakeSorted;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 40.89
 * MB
 * Beats
 * 62.41%
 * This file was created on 19/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public class MaxChunkToMakeSortedIter1 extends AbstractParent {


    public int maxChunksToSorted(int[] arr) {
        int retVal = 0, maxElement = 0;
       for (int i = 0; i < arr.length; i++) {
           maxElement = Math.max(maxElement, arr[i]);
           if (maxElement == i) {
               retVal++;
           }
       }
        return retVal;
    }

}
