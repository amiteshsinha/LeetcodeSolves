package com.leetcode.handOfStraights;

import java.util.TreeMap;

public class HandOfStraightsIter1 extends AbstractParent {

    /**
     * Runtime
     * 57
     * ms
     * Beats
     * 26.00%
     * of users with Java
     * Memory
     * 45.54
     * MB
     * Beats
     * 43.56%
     * of users with Java
     * @param hand
     * @param groupSize
     * @return
     */
    @Override
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        TreeMap<Integer, Integer> integerCountTreeMap = new TreeMap<>();

        for (int i : hand) {
            integerCountTreeMap.put(i, integerCountTreeMap.getOrDefault(i, 0) + 1);
        }
        int k, count;
        while (integerCountTreeMap.size() > 0) {
            k = integerCountTreeMap.firstKey();
            for (int j = k; j < groupSize + k; j++) {
                if (!integerCountTreeMap.containsKey(j)) {
                    return false;
                }
                count = integerCountTreeMap.get(j);
                if (count == 1) {
                    integerCountTreeMap.remove(j);
                } else {
                    integerCountTreeMap.put(j, count - 1);
                }
            }
        }
        return true;
    }
}
