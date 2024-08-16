package com.leetcode.maxDistanceInArrays;

import java.util.List;

public class MaxDistanceInArrays extends AbstractParent {

    @Override
    public int maxDistance(List<List<Integer>> arrays) {
        valArrayIdentifier min1 = null, min2 = null, max1 = null, max2 = null;
        int max, min;
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> currList = arrays.get(i);
            min = currList.get(0);
            max = currList.get(currList.size() - 1);
            if (min1 == null || min1.val >= min) {
                min2 = min1;
                min1 = new valArrayIdentifier(min, i);
            } else if (min2 == null || min2.val >= min) {
                min2 = new valArrayIdentifier(min, i);
            }
            if (max1 == null || max1.val <= max) {
                max2 = max1;
                max1 = new valArrayIdentifier(max, i);
            } else if (max2 == null || max2.val <= max) {
                max2 = new valArrayIdentifier(max, i);
            }
        }
        if (max1.arrId == min1.arrId) {
            return Math.max(Math.abs(max1.val - min2.val), Math.abs(max2.val - min1.val));
        } else {
            return Math.abs(max1.val - min1.val);
        }
    }

    class valArrayIdentifier {
        int val;
        int arrId;
        valArrayIdentifier(int val, int arrId) {
            this.val = val;
            this.arrId = arrId;
        }
    }
}
