package com.leetcode.handOfStraights;

import java.util.Arrays;

public class HandOfStraights extends AbstractParent {

    /**
     * Runtime
     * 188
     * ms
     * Beats
     * 5.03%
     * of users with Java
     * Memory
     * 45.23
     * MB
     * Beats
     * 72.20%
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
        int i = 0, index, k;
        while (i < hand.length) {
            if (hand[i] >= 0) {
                //temp = groupSize - 1;
                k = hand[i];
                hand[i] = -1;
                for (int j = k + 1; j < groupSize + k; j++) {
                    // search on the right
                    index = i + j - k;
                    if (hand[index] == j) {
                        hand[index] = -1;
                        //temp--;
                    } else {
                        int b = Arrays.binarySearch(hand, index, hand.length, j);
                        if (b > 0) {
                            hand[b] = -1;
                            Arrays.sort(hand, index, hand.length);
                            //temp--;
                        } else {
                            return false;
                        }
                    }
                }
                i += groupSize;
            } else {
                i++;
            }
        }
        return true;
    }
}
