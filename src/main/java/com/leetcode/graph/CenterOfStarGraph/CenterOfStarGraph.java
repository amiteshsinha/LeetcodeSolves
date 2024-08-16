package com.leetcode.graph.CenterOfStarGraph;

public class CenterOfStarGraph extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 66.75
     * MB
     * Beats
     * 69.74%
     * @param edges
     * @return
     */
    @Override
    public int findCenter(int[][] edges) {
        int[] first = edges[0];
        int[] second = edges[1];
        if (first[0] == second[1] || first[0] == second[0]) {
            return first[0];
        } else {
            return first[1];
        }
    }
}
