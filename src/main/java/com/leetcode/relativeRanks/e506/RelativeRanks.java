package com.leetcode.relativeRanks.e506;

import java.util.Arrays;

public class RelativeRanks extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 96.02%
     * of users with Java
     * Memory
     * 45.77
     * MB
     * Beats
     * 28.80%
     * of users with Java
     * @param score
     * @return
     */
    @Override
    public String[] findRelativeRanks(int[] score) {
        int[] rankArr = Arrays.copyOf(score, score.length);
        Arrays.sort(rankArr); // this gives us all the ranks - n- 1 = gold, n - 2 = silver etc
        String[] output = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int j = Arrays.binarySearch(rankArr, score[i]);
            output[i] = returnRank(score.length - j - 1);
        }
        return output;
    }
}
