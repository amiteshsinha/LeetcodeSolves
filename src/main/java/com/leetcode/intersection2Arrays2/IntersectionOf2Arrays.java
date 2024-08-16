package com.leetcode.intersection2Arrays2;

import java.util.Arrays;

public class IntersectionOf2Arrays extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 43.07
     * MB
     * Beats
     * 58.37%
     * @param nums1
     * @param nums2
     * @return
     */
    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqArr = new int[1001];
        int[] retArr = new int[1001];
        for (int i : nums1) {
            freqArr[i]++;
        }
        int counter = 0;
        for (int i : nums2) {
            if (freqArr[i] > 0) {
                retArr[counter] = i;
                freqArr[i]--;
                counter++;
            }
        }
        return Arrays.copyOfRange(retArr, 0, counter);
    }
}
