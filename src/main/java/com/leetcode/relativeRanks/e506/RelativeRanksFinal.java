package com.leetcode.relativeRanks.e506;

public class RelativeRanksFinal extends AbstractParent {

    @Override
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        final String[] medals = {"Gold Medal","Silver Medal","Bronze Medal"};
        String[] retStringArr = new String[length];
        int max = Integer.MIN_VALUE;
        for (int i : score) {
            max = Math.max(i, max);
        }
        int[] rankArr = new int[max + 1];
        for (int i = 0; i < length; i++) {
            rankArr[score[i]] = i + 1;
        }
        int rank = 1, originalIndex = 0;
        for (int i = max; rank <= length; i--) {
            if (rankArr[i] > 0) {
                 originalIndex = rankArr[i] - 1;
                if (rank < 4) {
                    retStringArr[originalIndex] = medals[rank - 1];
                } else {
                    retStringArr[originalIndex] = String.valueOf(rank);
                }
                rank++;
            }
        }
        return retStringArr;
    }
}
