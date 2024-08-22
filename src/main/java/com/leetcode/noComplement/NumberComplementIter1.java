package com.leetcode.noComplement;

public class NumberComplementIter1 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.48
     * MB
     * Beats
     * 37.76%
     *
     * @param num
     * @return
     */
    @Override
    public int findComplement(int num) {
        if (num == 0) {
            return 1;
        }
        int temp, retVal = 0, iteratorPower = 0;
        while (num != 0) {
            temp = num & 1;
            num = num >> 1;
            retVal += (temp ^ 1) * Math.pow(2, iteratorPower);
            iteratorPower++;
        }
        return retVal;
    }
}
