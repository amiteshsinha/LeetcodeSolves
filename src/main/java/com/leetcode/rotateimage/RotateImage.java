package com.leetcode.rotateimage;

public class RotateImage extends AbstractParent {

    @Override
    public void rotate(int[][] matrix) {
        // there are 4 exchanges to be done for any given position.
        print(matrix);
        int n = matrix.length;
        int temp = -1 , temp2 = -1;
        int aDown = 0, bLeft = n - 1, cUp =  n - 1, dRight = 0;
        for (int i = 0; i < n/2; i++) {
            for (int k = i; k < n - 1 - i; k++) {
                temp = matrix[aDown + k][n - 1 - i];
                matrix[aDown + k][n - 1 - i] = matrix[i][dRight + k];
                temp2 = matrix[n - 1 - i][bLeft - k];
                matrix[n - 1 - i][bLeft - k] = temp;
                matrix[i][dRight + k] = matrix[cUp - k][i];
                matrix[cUp - k][i] = temp2;
            }
            print(matrix);
        }
        print(matrix);
    }
}
