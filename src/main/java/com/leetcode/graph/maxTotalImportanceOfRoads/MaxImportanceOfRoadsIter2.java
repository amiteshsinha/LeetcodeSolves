package com.leetcode.graph.maxTotalImportanceOfRoads;

public class MaxImportanceOfRoadsIter2 extends AbstractParent {

    /**
     * Runtime
     * 6
     * ms
     * Beats
     * 98.92%
     *
     * Memory
     * 61.86
     * MB
     * Beats
     * 90.81%
     * @param n
     * @param roads
     * @return
     */
    @Override
    public long maximumImportance(int n, int[][] roads) {
        // max no of roads will always be n - 1 and min will always be 0
        long retSum = 0;
        int maxRoadCount = 0;
        int[] countArr = new int[n];
        int[] roadFreqCount;
        for (int[] road : roads) {
            countArr[road[0]]++;
            countArr[road[1]]++;
            maxRoadCount = Math.max(countArr[road[0]], maxRoadCount);
            maxRoadCount = Math.max(countArr[road[1]], maxRoadCount);
        }
        //count freq of roads
        roadFreqCount = new int[maxRoadCount + 1];
        for (int i = 0; i < n; i++) {
            roadFreqCount[countArr[i]]++;
        }
        // starting from right = maxRoadCount we decrease the road importance
        for (int i = maxRoadCount; i > 0; i--) {
            while (roadFreqCount[i] != 0) {
                retSum += (long)i * n--;
                roadFreqCount[i]--;
            }
        }
        return retSum;
    }

}
