package com.leetcode.luckyNoInMatrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LuckyNoInMatrix extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 93.93%
     * Analyze Complexity
     * Memory
     * 45.24
     * MB
     * Beats
     * 32.97%
     * @param matrix
     * @return
     */
    @Override
    public List<Integer> luckyNumbers(int[][] matrix) {
        int col = matrix.length, row = matrix[0].length,temp;
        List<Integer> retList = new ArrayList<>();
        Set<Integer> minElementSet = new HashSet<>();
        for (int i = 0; i < col; i++) {
            temp = Integer.MAX_VALUE;
            for (int j = 0; j < row; j++) {
                if (temp > matrix[i][j]) {
                    temp = matrix[i][j];
                }
            }
            minElementSet.add(temp);
        }
        for (int j = 0; j < row; j++) {
            temp = Integer.MIN_VALUE;
            for (int i = 0; i < col; i++) {
                if (matrix[i][j] > temp) {
                    temp = matrix[i][j];
                }
            }
            if (minElementSet.contains(temp)) {
                retList.add(temp);
            }
        }
        return retList;
    }
}
