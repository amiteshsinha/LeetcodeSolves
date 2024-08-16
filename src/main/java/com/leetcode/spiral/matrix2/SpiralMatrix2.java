package com.leetcode.spiral.matrix2;

public class SpiralMatrix2 extends AbstractParent {

    @Override
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int i = 0, j = 0, mid = n/2, counter = 1;
        for (; i < mid && j < mid; i++, j++) {
            for (int a = j; a < n - 1 - j && matrix[i][a] == 0; a++) {
                matrix[i][a] = counter++;
            }
            for (int b = i; b < n - 1 - i && matrix[b][n - 1 -j] == 0; b++) {
                matrix[b][n - 1 -j] = counter++;
            }
            for (int c = n - 1 - j; c > j && matrix[n - 1 - i][c] == 0; c--) {
                matrix[n - 1 - i][c] = counter++;
            }
            for (int d = n - 1 - i; d > i && matrix[d][j] == 0; d--) {
                matrix[d][j] = counter++;
            }
        }
        if (n%2 != 0) {
            matrix[i][j] = counter;
        }
        return matrix;
    }
}
