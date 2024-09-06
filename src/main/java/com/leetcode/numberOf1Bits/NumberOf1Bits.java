package com.leetcode.numberOf1Bits;

public class NumberOf1Bits extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.22
     * MB
     * Beats
     * 95.85%
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 18.43%
     *
     * Memory
     * 40.28
     * MB
     * Beats
     * 95.85%
     * @param n
     * @return
     */
    public int hammingWeight1(int n) {
        String temp = Integer.toBinaryString(n);
        int count = 0;
        for (char c : temp.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

}
