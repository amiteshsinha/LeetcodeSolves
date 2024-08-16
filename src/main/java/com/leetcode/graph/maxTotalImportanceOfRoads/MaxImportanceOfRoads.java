package com.leetcode.graph.maxTotalImportanceOfRoads;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxImportanceOfRoads extends AbstractParent {

    /**
     * Runtime
     * 88
     * ms
     * Beats
     * 7.03%
     *
     * Memory
     * 65.46
     * MB
     * Beats
     * 32.43%
     * @param n
     * @param roads
     * @return
     */
    @Override
    public long maximumImportance(int n, int[][] roads) {
        final Comparator<Map.Entry<Integer, Integer>> compareValue = Map.Entry.comparingByValue(Comparator.reverseOrder());
        Map<Integer,Integer> countTreeMap = new HashMap<>();
        Map<Integer, Integer> roadImportance = new HashMap<>();
        long retSum = 0;
        for (int[] road : roads) {
            countTreeMap.put(road[0], countTreeMap.getOrDefault(road[0], 0) + 1);
            countTreeMap.put(road[1], countTreeMap.getOrDefault(road[1], 0) + 1);
        }
        Map<Integer, Integer> sortedMap = countTreeMap.entrySet().stream().sorted(compareValue).collect(
                Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old1, old2) -> old1, LinkedHashMap::new));

        for (int key : sortedMap.keySet()) {
            roadImportance.put(key, n--);
        }
        for (int[] road : roads) {
            retSum += roadImportance.get(road[0]) + roadImportance.get(road[1]);
        }
        return retSum;
    }
}
