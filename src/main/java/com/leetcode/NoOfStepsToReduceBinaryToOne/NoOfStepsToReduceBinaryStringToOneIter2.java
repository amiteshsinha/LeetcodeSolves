package com.leetcode.NoOfStepsToReduceBinaryToOne;

public class NoOfStepsToReduceBinaryStringToOneIter2 extends AbstractParent {

    /**
     *Runtime
     * 3
     * ms
     * Beats
     * 20.13%
     * of users with Java
     * Memory
     * 41.26
     * MB
     * Beats
     * 57.23%
     * of users with Java
     */
    @Override
    public int numSteps(String s) {
        int retVal = 0 , i , carry;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() != 1) {
            // divide by 2
            if (sb.charAt(sb.length() - 1) == '0') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                i = sb.length() - 2;
                carry = 1;
                sb.setCharAt(sb.length() - 1, '0');
                while (carry != 0) {
                    if (i >= 0) {
                        carry += sb.charAt(i) - '0';
                        sb.setCharAt(i, Character.forDigit(carry % 2, 10));
                        carry = carry / 2;
                        i--;
                    } else {
                        sb.reverse().append(carry).reverse();
                        break;
                    }
                }
            }
            retVal++;
        }
        return retVal;
    }
}
