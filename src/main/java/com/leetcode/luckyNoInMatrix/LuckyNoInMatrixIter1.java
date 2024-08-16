package com.leetcode.luckyNoInMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNoInMatrixIter1 extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 42.69%
     *
     * Memory
     * 45.18
     * MB
     * Beats
     * 51.10%
     * @param matrix
     * @return
     */
    @Override
    public List<Integer> luckyNumbers(int[][] matrix) {
        int col = matrix.length, row = matrix[0].length, minRow;
        List<Integer> retList = new ArrayList<>();
        Set<Integer> minElementSet = new HashSet<>();
        int[] maxColArr = new int[row];
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
            minElementSet.add(minRow);
        }
        for (int j = row - 1; j >= 0; j--) {
            if (minElementSet.contains(maxColArr[j])) {
                retList.add(maxColArr[j]);
            }
        }
        return retList;
    }
}
