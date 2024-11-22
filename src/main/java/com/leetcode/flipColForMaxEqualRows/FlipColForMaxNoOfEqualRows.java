package com.leetcode.flipColForMaxEqualRows;

import java.util.HashMap;
import java.util.Map;

/**
 * Runtime
 * 49
 * ms
 * Beats
 * 31.46%
 *
 * Memory
 * 61.54
 * MB
 * Beats
 * 13.43%
 * This file was created on 22/11/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class FlipColForMaxNoOfEqualRows extends AbstractParent {

    @Override
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Ask is to find max number of rows with equal values - doesnt talk about min no of tries reqd to do so
        // if we can find rows with same pattern - 001 and 110 are same pattern but 101 is different
        Map<String, Integer> map = new HashMap<>();
        int max = 0, currMax;
        for (int i = 0; i < matrix.length; i++) {
            //convert each row to a string and also the inverse of it
            // add it to a map. so basically we are grouping same patterns together.
            // return the largest group
            String[] arr = getStringForArr(matrix[i]);
            map.put(arr[0], map.getOrDefault(arr[0], 0) + 1);
            map.put(arr[1], map.getOrDefault(arr[1], 0) + 1);
            currMax = map.get(arr[0]);
            if (currMax > max) {
                max = currMax;
            }
        }
        return max;
    }

    private String[] getStringForArr(int[] arr) {
        StringBuilder stringBuilderFwd = new StringBuilder();
        StringBuilder stringBuilderFlp = new StringBuilder();
        for (int i = 0 ; i < arr.length; i++) {
            stringBuilderFwd.append(arr[i]);
            stringBuilderFlp.append(arr[i] == 0 ? 1 : 0);
        }
        return new String[]{stringBuilderFwd.toString(), stringBuilderFlp.toString()};
    }

    private int countNumberOfRowsWithSameVal(int[][] matrix) {
        if (matrix[0].length == 1) {
            return matrix.length;
        }
        int retCount = 0;
        outer:
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == matrix[i][1]) {
                int curr = matrix[i][0];
                for (int j = 2; j < matrix[0].length; j++) {
                    if (matrix[i][j] != curr) {
                        continue outer;
                    }
                }
                retCount++;
            }
        }
        return retCount;
    }
}
