package com.leetcode.pascal.triangle2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PascalTriangle2Recursive extends AbstractParent {

    // method 1 recurrsive
    public List<Integer> getRow(int rowIndex) {
        int[] arr = new int[rowIndex + 1];
        if (rowIndex == 0) {
            arr[0] = 1;
        } else {
            List<Integer> list = getRow(rowIndex - 1);
            arr[0] = arr[rowIndex] = 1;
            int mid = rowIndex/2 + 1;
            for (int i = 1, j = rowIndex - 1; i < mid; i++, j--) {
                arr[i] = arr[j] = list.get(i - 1) + list.get(i);
            }
        }
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        return arrList;
    }

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
    public List<Integer> getRow1(int rowIndex) {
        int[][] matrix = new int[rowIndex + 2][rowIndex + 2];
        matrix[0][1] = 1;
        print(matrix, matrix.length);
        for (int k = 1; k < rowIndex + 1; k++) {
            matrix[k][1] = matrix[k][rowIndex] = 1;
            print(matrix, matrix.length);
            int mid = rowIndex / 2 + 1;
            for (int i = 1, j = rowIndex - 1; i < mid; i++, j--) {
                matrix[k][i] = matrix[k][j] = matrix[k - 1][i - 1] + matrix[k - 1][i];
            }
            print(matrix, matrix.length);
        }
        List<Integer> arrList = new ArrayList<>();
        arrList.addAll(Arrays.stream(matrix[rowIndex]).boxed().collect(Collectors.toList())
                .subList(1, rowIndex + 1));
        return arrList;
    }

    void print(int[][] matrix,int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
