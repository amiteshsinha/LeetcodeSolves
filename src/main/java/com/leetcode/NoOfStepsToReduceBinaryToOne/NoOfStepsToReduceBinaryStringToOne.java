package com.leetcode.NoOfStepsToReduceBinaryToOne;

public class NoOfStepsToReduceBinaryStringToOne extends AbstractParent {

    /**
     * Runtime
     * 16
     * ms
     * Beats
     * 6.50%
     * of users with Java
     * Memory
     * 44.15
     * MB
     * Beats
     * 11.32%
     * of users with Java
     * @param s
     * @return
     */
    @Override
    public int numSteps(String s) {
        int retVal = 0;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() != 1) {
            // divide by 2
            if (sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                StringBuilder temp = new StringBuilder("0");
                int i = sb.length() - 2, carry = 1;
                while (i >= 0 || carry == 1) {
                    carry += (i >= 0) ? sb.charAt(i--) - '0' : 0;
                    temp.append(carry % 2);
                    carry = carry / 2;
                }
                sb = temp.reverse();
            }
            retVal++;
        }
        return retVal;
    }
}
