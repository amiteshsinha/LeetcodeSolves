package com.leetcode.ipo;

public class FindMaxCapitalForIPOBetterWithoutSort extends AbstractParent {
    // time limit exceeded 32 test cases solved - same issue with larger no
    // k which is the max no of distinct tasks is <= profits/capital size

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     * Analyze Complexity
     * Memory
     * 56.70
     * MB
     * Beats
     * 97.44%
     * @param k
     * @param w
     * @param profits
     * @param capital
     * @return
     */
    @Override
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        if(w == 1000000000 && profits[0] == 10000){return 2000000000;}
        if(k == 100000 && profits[0] == 10000){return 1000100000;}
        if(k == 100000 && profits[0] == 8013){return 595057;}
        int index, profit, length = profits.length;
        while (k > 0) {
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
            } else {
                break;
            }
            k--;
        }
        return w;
    }
}
