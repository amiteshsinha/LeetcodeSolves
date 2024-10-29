package com.leetcode.countSquareSubmatriceWithAllOnes;

/**
 * Runtime
 * 10
 * ms
 * Beats
 * 12.20%
 *
 * Memory
 * 54.49
 * MB
 * Beats
 * 97.15%
 * This file was created on 27/10/24 / Sunday
 *
 * We need to find what is the square with max size on any index - for that n size square -
 * we can get the no of squares within it - that would always be equal to n(n+1)(2n+1)/6
 *
 * @author Amitesh Sinha
 */
public class CountSquareSubmatricesWithAllOnes extends AbstractParent {

    @Override
    public int countSquares(int[][] matrix) {
        int retval = 0;
        int[][] visted = new int[matrix.length][matrix[0].length];
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                visted[i][j] = -1;
            }
        }
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                retval += getMaxSideFor(matrix, i, j, visted);
            }
        }
        print(visted);
        return retval;
    }

    private int getMaxSideFor(int[][] matrix, int x, int y, int[][] visted) {
        if (x >= matrix.length || y >= matrix[0].length || matrix[x][y] == 0) {
            return 0;
        }
        if (visted[x][y] != -1) {
            return visted[x][y];
        }
        int right = getMaxSideFor(matrix, x, y + 1, visted);
        int bottom = getMaxSideFor(matrix, x + 1, y, visted);
        int diagonal = getMaxSideFor(matrix, x+ 1, y + 1, visted);
        visted[x][y] = 1 + Math.min(diagonal, Math.min(right, bottom));
        return visted[x][y];
    }

}
