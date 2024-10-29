package com.leetcode.countSquareSubmatriceWithAllOnes;

/**
 * Runtime
 * 7
 * ms
 * Beats
 * 47.31%
 *
 * Memory
 * 56.08
 * MB
 * Beats
 * 25.27%
 * This file was created on 27/10/24 / Sunday
 * <p>
 * Modifying the same matrix and updating the value of the
 *
 * @author Amitesh Sinha
 */
public class CountSquareSubmatricesWithAllOnesIter1 extends AbstractParent {

    @Override
    public int countSquares(int[][] matrix) {
        int retval = 0, left, top, diagonal, current;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0) {
                    if (i > 0 && j > 0) {
                        left = matrix[i - 1][j];
                        top = matrix[i][j - 1];
                        diagonal = matrix[i - 1][j - 1];
                        current = Math.min(left, Math.min(top, diagonal));
                        if (current > 0) {
                            matrix[i][j] = 1 + current;
                        }
                    }
                    retval += matrix[i][j];
                }
            }
        }
        //print(matrix);
        return retval;
    }
}
