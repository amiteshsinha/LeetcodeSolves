package com.leetcode.rankTransformAnArray;

import com.sun.source.tree.Tree;

import java.util.*;

/**
 * Runtime
 * 43
 * ms
 * Beats
 * 20.74%
 *
 * Memory
 * 65.86
 * MB
 * Beats
 * 7.27%
 * This file was created on 02/10/24 / Wednesday
 */
public class RankTransformAnArrayIter1 extends AbstractParent {

    @Override
    public int[] arrayRankTransform(int[] arr) {
        int[] retArr = new int[arr.length];
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = arr.length;
        for (int i : arr) {
            if (!set.add(i)) {
                rank--;
            }
        }
        for (Integer i : set.descendingSet()) {
            rankMap.put(i, rank);
            rank--;
        }
        for (int i = 0; i < arr.length; i++) {
            retArr[i] = rankMap.get(arr[i]);
        }
        return retArr;
    }
}
