package com.leetcode.findXorOfNoAppearTwice;

public class XorOfNoAppearingTwice extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 42.53
     * MB
     * Beats
     * 90.14%
     * @param nums
     * @return
     */
    @Override
    public int duplicateNumbersXOR(int[] nums) {
        int retval = 0;
        boolean[] appearedArr = new boolean[51];
        for (int i : nums) {
            if (appearedArr[i]) {
                retval ^= i;
            } else {
                appearedArr[i] = true;
            }
        }
        return retval;
    }
}
