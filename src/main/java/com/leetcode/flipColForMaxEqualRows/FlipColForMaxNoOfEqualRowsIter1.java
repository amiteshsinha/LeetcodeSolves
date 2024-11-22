package com.leetcode.flipColForMaxEqualRows;

import java.util.HashMap;
import java.util.Map;

/**
 * Runtime
 * 16
 * ms
 * Beats
 * 96.63%
 *
 * Memory
 * 58.39
 * MB
 * Beats
 * 69.40%
 * This file was created on 22/11/24 / Friday
 *
 * @author Amitesh Sinha
 */
public class FlipColForMaxNoOfEqualRowsIter1 extends AbstractParent {

    @Override
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Ask is to find max number of rows with equal values - doesnt talk about min no of tries reqd to do so
        // if we can find rows with same pattern - 001 and 110 are same pattern but 101 is different
        Map<String, Integer> map = new HashMap<>();
        int max = 0, currMax;
        StringBuilder stringBuilder;
        for (int[] arr : matrix) {
            //convert each row to a string and also the inverse of it
            // add it to a map. so basically we are grouping same patterns together.
            // return the largest group
            stringBuilder = new StringBuilder();
            for (int i = 0 ; i < arr.length; i++) {
                if (arr[0] == arr[i]) {
                    stringBuilder.append('T');
                } else {
                    stringBuilder.append('F');
                }
            }
            String val = stringBuilder.toString();
            currMax = map.getOrDefault(val , 0) + 1;
            map.put(val, currMax);
            max = Math.max(max, currMax);
        }
        return max;
    }
}
