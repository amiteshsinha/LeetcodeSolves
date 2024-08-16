package com.leetcode.findMissingObservations;

public class MissingDiceObservations extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 61.01
     * MB
     * Beats
     * 59.79%
     * @param rolls
     * @param mean
     * @param n
     * @return
     */
    @Override
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ret = new int[n];
        int sum = 0;
        for (int i : rolls) {
            sum += i;
        }
        int missingSum = mean * (n + rolls.length) - sum;
        if (missingSum > 6*n || missingSum < n) {
            return new int[]{};
        }
        int expectedAvg = missingSum/n, remainder = missingSum%n;

        for (int i = 0; i < remainder; i++) {
            ret[i] = expectedAvg + 1;
        }
        for (int i = remainder; i < n;i++) {
            ret[i] = expectedAvg;
        }
        return ret;
    }
}
