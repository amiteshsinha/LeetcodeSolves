package com.leetcode.findChampion2;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 100.00%
 * 
 * Memory
 * 45.56
 * MB
 * Beats
 * 75.18%
 * Analyze
 * This file was created on 26/11/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public class FindChampion2Iter2 extends AbstractParent {

    @Override
    public int findChampion(int n, int[][] edges) {
        boolean[] inDegreeArray = new boolean[n];
        for (int[] edge : edges) {
            if (edge.length > 0) {
                inDegreeArray[edge[1]] = true;
            }
        }
        int count = 0, champion = -1;
        for (int i = 0; i < n; i++) {
            if (!inDegreeArray[i]) {
                count++;
                champion = i;
            }
        }
        return count == 1 ? champion : -1;
    }

}
