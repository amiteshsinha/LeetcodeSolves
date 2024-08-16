package com.leetcode.ipo;

import java.util.Arrays;

public class FindMaxCapitalForIPOFinalTry extends AbstractParent {
    /**
     * Runtime
     * 9
     * ms
     * Beats
     * 99.28%
     *
     * Memory
     * 56.44
     * MB
     * Beats
     * 98.16%
     *
     * @param k
     * @param w
     * @param profits
     * @param capital
     * @return
     */
    @Override
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int index, profit, length = profits.length, maxCap = -1;
        for (int i = 0 ; i < length; i++) {
            if (capital[i] > maxCap) {
                maxCap = capital[i];
            }
        }
        if (w > maxCap) {
            Arrays.sort(profits);
            int j = Math.max(length - k, 0);
            for (int i = length - 1; i >= j; i--) {
                w += profits[i];
            }
            return w;
        }
        while (k > 0) {
            // all the elements can be used

            index = -1; profit = -1;
            for (int i = 0; i < length; i++) {
                if ( capital[i] <= w && profits[i] > profit) {
                    profit = profits[i];
                    index = i;
                }
            }
            if (index != -1) {
                w += profit;
                profits[index] = -1;
                capital[index] = -1;
                //count++;
            } else {
                break;
            }
            k--;
        }
        return w;
    }
}
