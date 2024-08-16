package com.leetcode.MaxNoConsecutiveValues;

import java.util.Arrays;

public class MaxNoOfConsecutiveValueFromCoin extends AbstractParent {

    /**
     * Runtime
     * 16
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 52.64
     * MB
     * Beats
     * 69.51%
     * @param coins
     * @return
     */
    @Override
    public int getMaximumConsecutive(int[] coins) {
        int missCount = 1;
        Arrays.sort(coins);
        for (int i : coins) {
            if (missCount < i) {
                break;
            }
            missCount += i;
        }
        return missCount;
    }
}
