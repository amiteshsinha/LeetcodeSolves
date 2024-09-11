package com.leetcode.minBitFlitsConvertNo;

public class MinBitFlitsToConvertNoIter1 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.19
     * MB
     * Beats
     * 90.99%
     * @param start
     * @param goal
     * @return
     */
    @Override
    public int minBitFlips(int start, int goal) {
        int retVal = 0, i , j;
        while (start != 0 || goal != 0) {
            i = start & 1;
            j = goal & 1;
            if (i != j) {
                retVal++;
            }
            start = start >> 1;
            goal = goal >> 1;
        }
        retVal += start == 0 ? getBits(start) : getBits(goal);
        return retVal;
    }

    private int getBits(int goal) {
        int retVal = 0, j;
        while (goal != 0) {
            j = goal & 1;
            if (j == 1) {
                retVal++;
            }
            goal = goal >> 1;
        }
        return retVal;
    }
}
