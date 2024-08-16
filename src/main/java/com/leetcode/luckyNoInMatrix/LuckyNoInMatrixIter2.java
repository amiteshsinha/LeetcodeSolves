package com.leetcode.luckyNoInMatrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNoInMatrixIter2 extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 93.93%
     * Analyze Complexity
     * Memory
     * 44.93
     * MB
     * Beats
     * 82.41%
     * @param matrix
     * @return
     */
    @Override
    public List<Integer> luckyNumbers(int[][] matrix) {
        int col = matrix.length, row = matrix[0].length, minRow;
        List<Integer> retList = new ArrayList<>();
        int[] maxColArr = new int[row];
        int[] minRowArr = new int[col];
        for (int i = 0; i < col; i++) {
            minRow = Integer.MAX_VALUE;
            for (int j = 0; j < row; j++) {
                if (matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                }
                if (matrix[i][j] > maxColArr[j]) {
                    maxColArr[j] = matrix[i][j];
                }
            }
            minRowArr[i] = minRow;
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (minRowArr[i] == maxColArr[j]) {
                    retList.add(minRowArr[i]);
                    break;
                }
            }
        }
        return retList;
    }
}
