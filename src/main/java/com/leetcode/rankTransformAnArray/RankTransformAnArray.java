package com.leetcode.rankTransformAnArray;

import java.util.HashSet;
import java.util.Set;

/**
 * Memory limit exceeded
 * This file was created on 02/10/24 / Wednesday
 */
public class RankTransformAnArray extends AbstractParent {

    @Override
    public int[] arrayRankTransform(int[] arr) {
        int[] retArr = new int[arr.length];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int[] indexArr = new int[max - min + 1];
        int rank = arr.length;
        for (int i : arr) {
            indexArr[i - min]++;
            if (indexArr[i - min] > 1) {
                rank--;
            }
        }
        for (int i = max - min; i >= 0; i--) {
            if (indexArr[i] > 0) {
                indexArr[i] = rank;
                rank--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            retArr[i] = indexArr[arr[i] - min];
        }
        return retArr;
    }
}
