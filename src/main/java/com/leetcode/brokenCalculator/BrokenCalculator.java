package com.leetcode.brokenCalculator;

public class BrokenCalculator extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.24
     * MB
     * Beats
     * 62.32%
     * @param startValue
     * @param target
     * @return
     */
    @Override
    public int brokenCalc(int startValue, int target) {
        int retVal = 0;
        //start is smaller than target
        while (target > startValue) {
            retVal++;
            if (target%2 == 1) {
                target++;
            } else {
                target = target/2;
            }
        }
        return retVal + startValue - target;
    }
}
