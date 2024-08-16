package com.leetcode.relativeRanks.e506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanksIter1 extends AbstractParent {

    /**
     * n == score.length
     * 1 <= n <= 104
     * 0 <= score[i] <= 106
     * @param score
     * @return
     */
    @Override
    public String[] findRelativeRanks(int[] score) {
        String[] retStringArray = new String[score.length];
        int[] rankArr = Arrays.copyOf(score, score.length);
        Arrays.sort(rankArr);
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int i = score.length - 1; i != -1; i--) {
            rankMap.put(rankArr[i], rank++);
        }
        for (int i = 0; i < score.length; i++) {
            retStringArray[i] = returnRank(rankMap.get(score[i]));
        }
        return retStringArray;
    }

    protected String returnRank(int n) {
        switch(n) {
            case 1 :
                return "Gold Medal";
            case 2 :
                return "Silver Medal";
            case 3 :
                return "Bronze Medal";
            default:
                return n + "";
        }
    }
}
