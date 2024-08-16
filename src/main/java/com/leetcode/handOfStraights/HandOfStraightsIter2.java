package com.leetcode.handOfStraights;

import java.util.Arrays;

public class HandOfStraightsIter2 extends AbstractParent {

    /**
     * Runtime
     * 8
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 44.30
     * MB
     * Beats
     * 99.94%
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
        Arrays.sort(hand);
        int i = 0, length = hand.length;
        for (; i < length; i++) {
            if (hand[i] >= 0 && !findAllSuccessors(hand, i, groupSize, length)) {
                return false;
            }
        }
        return true;
    }

    /**
     * starting with index i mark all consecutive numbers as -1. if the number doesn't exist return false
     * @param hand
     * @param i
     * @param groupSize
     * @param length
     * @return
     */
    private boolean findAllSuccessors(int[] hand, int i, int groupSize, int length) {
        int j = hand[i] + 1, temp = 1;
        hand[i] = -1;
        i += 1;
        while (i < length &&  temp < groupSize) {
            if (hand[i] == j) {
                hand[i] = -1;
                temp++;
                j++;
            }
            i++;
        }
        if (temp != groupSize) {
            return false;
        }
        return true;
    }
}
