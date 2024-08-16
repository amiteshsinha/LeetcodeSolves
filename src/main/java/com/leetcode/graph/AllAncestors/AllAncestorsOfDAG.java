package com.leetcode.graph.AllAncestors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AllAncestorsOfDAG extends AbstractParent {

    /**
     * Runtime
     * 209
     * ms
     * Beats
     * 22.32%
     * Analyze Complexity
     * Memory
     * 63.94
     * MB
     * Beats
     * 92.27%
     * @param n
     * @param edges
     * @return
     */
    @Override
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        Map<Integer, List<Integer>> nodeImmediateAncestorMap = new HashMap<>();
        for (int[] edge : edges) {
            if (!nodeImmediateAncestorMap.containsKey(edge[1])) {
                nodeImmediateAncestorMap.put(edge[1], new ArrayList<>());
            }
            nodeImmediateAncestorMap.get(edge[1]).add(edge[0]);
        }
        List<List<Integer>> retList = new ArrayList<>();
        int temp;
        Set<Integer> sortedAncestorSet = new TreeSet<>();
        List<Integer> iterList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!nodeImmediateAncestorMap.containsKey(i)) {
                retList.add(new ArrayList<>());
                continue;
            }
            // check for each add to set and then repeat until list is empty
            iterList.addAll(nodeImmediateAncestorMap.get(i));
            while (!iterList.isEmpty()) {
                temp = iterList.remove(0);
               if (sortedAncestorSet.add(temp) && nodeImmediateAncestorMap.containsKey(temp)) {
                   iterList.addAll(nodeImmediateAncestorMap.get(temp));
               }
            }
            retList.add(new ArrayList<>(sortedAncestorSet));
            sortedAncestorSet.clear();
        }
        return retList;
    }
}
