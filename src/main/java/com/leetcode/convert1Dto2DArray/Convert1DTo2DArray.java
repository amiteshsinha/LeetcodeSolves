package com.leetcode.convert1Dto2DArray;

public class Convert1DTo2DArray extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 89.77%
     *
     * Memory
     * 55.64
     * MB
     * Beats
     * 24.34%
     * @param original
     * @param m
     * @param n
     * @return
     */
    @Override
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m*n) {
            return new int[][]{};
        }
        int[][] retArr = new int[m][n];
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                retArr[i][j] = original[k];
                k++;
            }
        }
        return retArr;
    }
}
