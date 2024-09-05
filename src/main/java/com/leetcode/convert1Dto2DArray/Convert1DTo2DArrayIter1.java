package com.leetcode.convert1Dto2DArray;

import java.util.Arrays;

public class Convert1DTo2DArrayIter1 extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 55.43
     * MB
     * Beats
     * 60.05%
     * @param original
     * @param m
     * @param n
     * @return
     */
    @Override
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m*n) {
            return new int[0][0];
        }
        int[][] retArr = new int[m][];
        int k = 0;
        while (k < m) {
            retArr[k] = Arrays.copyOfRange(original, k*n, (k + 1)*n);
            k++;
        }
        return retArr;
    }
}
