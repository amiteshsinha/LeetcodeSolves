package com.leetcode.rotateimage;

public class RotateImageBetterCode extends AbstractParent {

    @Override
    public void rotate(int[][] matrix) {
        // there are 4 exchanges to be done for any given position.
        int n = matrix.length;
        int temp = -1;
        for (int i = 0; i < n/2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
            //print(matrix);
        }
        //print(matrix);
    }
}
