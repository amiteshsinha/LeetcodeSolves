package com.leetcode.heightChecker;

import java.util.Arrays;

public class HeightChecker extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 88.93%
     * of users with Java
     * Memory
     * 41.11
     * MB
     * Beats
     * 65.80%
     * of users with Java
     * @param heights
     * @return
     */
    @Override
    public int heightChecker(int[] heights) {
        int[] actualArr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(actualArr);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (actualArr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
