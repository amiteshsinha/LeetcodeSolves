package com.leetcode.findChampion2;

import java.util.*;

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
public class FindChampion2Iter1 extends AbstractParent {

    @Override
    public int findChampion(int n, int[][] edges) {
        int[] inDegreeArray = new int[n];
        for (int[] edge : edges) {
            if (edge.length > 0) {
                inDegreeArray[edge[1]]++;
            }
        }
        int count = 0, champion = -1;
        for (int i = 0; i < n; i++) {
            if (inDegreeArray[i] == 0) {
                count++;
                champion = i;
            }
        }
        return count == 1 ? champion : -1;
    }

}
