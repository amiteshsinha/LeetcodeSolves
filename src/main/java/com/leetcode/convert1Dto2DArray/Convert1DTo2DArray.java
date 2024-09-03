package com.leetcode.convert1Dto2DArray;

public class Convert1DTo2DArray extends AbstractParent {

    @Override
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] retArr = new int[m][n];
        int i = 0, j = 0;
        for (int k = 0; k < original.length; k++) {
            retArr[i][j] = original[k];
            j++;
            if (j == n) {
                i++;
                j = 0;
            }
        }
        return retArr;
    }
}
