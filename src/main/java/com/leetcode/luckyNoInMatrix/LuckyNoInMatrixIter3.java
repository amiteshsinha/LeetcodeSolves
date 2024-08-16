package com.leetcode.luckyNoInMatrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNoInMatrixIter3 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 45.06
     * MB
     * Beats
     * 66.83%
     * Apparently putting this in a single method doesnt work
     * @param matrix
     * @return
     */
    @Override
    public List<Integer> luckyNumbers(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length, minCol, temp;
        List<Integer> retList = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            minCol = getMinCol(matrix, i); // if i add this function to the main for loop - runtime jumps to 2 ms
            // now we have the col and we have the value - now check in the column whether we have a no greater than current min
            temp = matrix[i][minCol];
            if (isMaxInCol(matrix, temp, minCol)) {
                retList.add(temp);
            }
        }
        return retList;
    }

    private int getMinCol(int[][] matrix, int row) {
        int temp = matrix[row][0];
        int minCol = 0;
        for (int j = 1; j < matrix[row].length; j++) {
            if (temp > matrix[row][j]) {
                temp = matrix[row][j];
                minCol = j;
            }
        }
        return minCol;
    }

    private boolean isMaxInCol(int[][] matrix, int temp, int col) {
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][col] > temp) {
                return false;
            }
        }
        return true;
    }
}
