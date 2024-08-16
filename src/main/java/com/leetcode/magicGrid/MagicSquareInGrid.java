package com.leetcode.magicGrid;

public class MagicSquareInGrid extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 41.10
     * MB
     * Beats
     * 71.89%
     * @param grid
     * @return
     */
    @Override
    public int numMagicSquaresInside(int[][] grid) {
        int retval = 0;
        int row = grid.length, col = grid[0].length;
        if (row < 3 || col < 3) {
            return retval;
        }
        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < col - 2; j++) {
                if (isValidMagicSquare(grid, i, j)) {
                    retval++;
                }
            }
        }
        return retval;
    }

    private boolean isValidMagicSquare(int[][] grid, int rowStart, int colStart) {
        boolean isValid = true;
        int rowSum, diagSum = 0;
        int[] validArr = new int[10];
        int[] colSumArr = new int[3];
        for (int i = rowStart; i < rowStart + 3; i++) {
            rowSum = 0;
            for (int j = colStart; j < colStart + 3;j++) {
                if (grid[i][j] > 9 || grid[i][j] < 1) {
                    return false;
                }
                if (validArr[grid[i][j]] != 0) {
                    return false;
                }
                validArr[grid[i][j]] = 1;
                rowSum += grid[i][j];
                if (i - rowStart == j - colStart) {
                    diagSum += grid[i][j];
                }
                colSumArr[j - colStart] += grid[i][j];
            }
            if (rowSum != 15) {
                return false;
            }
        }
        if (diagSum != 15) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (colSumArr[i] != 15) {
                return false;
            }
        }
        return isValid;
    }
}
