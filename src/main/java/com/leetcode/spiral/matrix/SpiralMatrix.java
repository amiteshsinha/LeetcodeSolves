package com.leetcode.spiral.matrix;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix extends AbstractParent {

    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> retList = new LinkedList<>();
        int colSize = matrix.length;
        int rowSize = matrix[0].length;
        int[][] refMatrix =new int[colSize][rowSize];

        int i = 0, j = 0;
        int colMid = colSize/2 + 1, rowMid = rowSize/2 + 1;
        for (; i < colMid && j < rowMid; i++, j++) {
            for (int a = j; a < rowSize - 1 - j && refMatrix[i][a] != 1; a++) {
                retList.add(matrix[i][a]);
                refMatrix[i][a] = 1;
            }
            for (int b = i; b < colSize - 1 - i && refMatrix[b][rowSize - 1 -j] != 1; b++) {
                retList.add(matrix[b][rowSize - 1 -j]);
                refMatrix[b][rowSize - 1 -j] = 1;
            }
            for (int c = rowSize - 1 - j; c > j && refMatrix[colSize - 1 - i][c] != 1; c--) {
                retList.add(matrix[colSize - 1 - i][c]);
                refMatrix[colSize - 1 - i][c] = 1;
            }
            for (int d = colSize - 1 - i; d > i && refMatrix[d][j] != 1; d--) {
                retList.add(matrix[d][j]);
                refMatrix[d][j] = 1;
            }
        }
        if (colSize % 2 != 0 && rowSize % 2 != 0 && colSize == rowSize) {
            retList.add(matrix[colSize/2][rowSize/2]);
        }
        // take 4 variables for 4 directions and add in that direction
        // Increase variables until all
        return retList;
    }
}
