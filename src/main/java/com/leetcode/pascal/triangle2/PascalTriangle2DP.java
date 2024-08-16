package com.leetcode.pascal.triangle2;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2DP extends AbstractParent {

    //using dp
    /**
     * 0 -> 0 1 0
     * 1 -> 0 1 1 0
     * 2 -> 0 1 2 1 0
     * 3 -> 0 1 3 3 1 0
     * 4 -> 0 1 4 6 4 1 0
     * 5 -> 0 1 5 10 10 5 1 0
     * 6 -> 0 1 6 15 20 15 6 1 0
     * 7 -> 0 1 7 21 35 35 21 7 1 0
     * 8 -> 0 1 8 28 56 70 56 28 8 1 0
     * 9 -> 0 1 9 36 84 126 126 84 36 9 1 0
     */
    public List<Integer> getRow(int rowIndex) {
        int[][] matrix = new int[rowIndex + 1][rowIndex + 2];
        matrix[0][1] = 1;
        //print(matrix);
        for (int k = 1; k < rowIndex + 1; k++) {
            int mid = k / 2 + 1;
            for (int i = 1, j = k + 1; i <= mid; i++, j--) {
                matrix[k][i] = matrix[k][j] = matrix[k - 1][i - 1] + matrix[k - 1][i];
            }
           // print(matrix);
        }
        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i < rowIndex + 2; i++) {
            arrList.add(matrix[rowIndex][i]);
        }
        return arrList;
    }

    void print(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
