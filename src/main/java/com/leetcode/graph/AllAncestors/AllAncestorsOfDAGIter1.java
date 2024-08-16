package com.leetcode.graph.AllAncestors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAncestorsOfDAGIter1 extends AbstractParent {

    /**
     * Runtime
     * 77
     * ms
     * Beats
     * 63.52%
     *
     * Memory
     * 66.59
     * MB
     * Beats
     * 51.07%
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
        int temp, max;
        int[] ancestorArr = new int[n];
        List<Integer> iterList = new ArrayList<>();
        List<Integer> tempList;
        for (int i = 0; i < n; i++) {
            if (!nodeImmediateAncestorMap.containsKey(i)) {
                retList.add(new ArrayList<>());
                continue;
            }
            max = 0;
            // check for each add to set and then repeat until list is empty
            iterList.addAll(nodeImmediateAncestorMap.get(i));
            while (!iterList.isEmpty()) {
                temp = iterList.remove(0);
                if (ancestorArr[temp] == 0) {
                    ancestorArr[temp] = 1;
                    if (temp > max) {
                        max = temp;
                    }
                    if (nodeImmediateAncestorMap.containsKey(temp)) {
                        iterList.addAll(nodeImmediateAncestorMap.get(temp));
                    }
                }
            }
            max++;
            tempList = new ArrayList<>();
            for (int j = 0; j < max; j++) {
                if (ancestorArr[j] == 1) {
                    tempList.add(j);
                    ancestorArr[j] = 0;
                }
            }
            retList.add(tempList);
        }
        return retList;
    }
}
