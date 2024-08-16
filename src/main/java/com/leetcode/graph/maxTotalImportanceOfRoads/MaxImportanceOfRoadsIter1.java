package com.leetcode.graph.maxTotalImportanceOfRoads;

import java.util.ArrayList;
import java.util.List;

public class MaxImportanceOfRoadsIter1 extends AbstractParent {

    /**
     * Runtime
     * 19
     * ms
     * Beats
     * 48.11%
     * Analyze Complexity
     * Memory
     * 70.74
     * MB
     * Beats
     * 16.76%
     * @param n
     * @param roads
     * @return
     */
    @Override
    public long maximumImportance(int n, int[][] roads) {
        // max no of roads will always be n - 1 and min will always be 0
        int retSum = 0, size = n;
        int[] countArr = new int[size];
        for (int[] road : roads) {
            countArr[road[0]]++;
            countArr[road[1]]++;
        }
        // make a pair and sort by values then assign them importance and then sum
        List<Pair> sortedList = new ArrayList<>();
        Pair temp;
        for (int i = 0; i < size ;i++) {
            temp = new Pair(i, countArr[i]);
            sortedList.add(temp);
        }
        sortedList.sort((a,b) -> b.count - a.count);
        for (int i = 0; i < size; i++) {
            countArr[sortedList.get(i).node] = n--;
        }
        for (int[] road : roads) {
            retSum += countArr[road[0]] + countArr[road[1]];
        }
        return retSum;
    }

    class Pair {
        int node;
        int count;
        Pair(int node, int count) {
            this.node = node;
            this.count = count;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Pair{");
            sb.append("node=").append(node);
            sb.append(", count=").append(count);
            sb.append('}');
            return sb.toString();
        }
    }

}
