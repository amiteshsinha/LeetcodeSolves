package com.leetcode.NoOfStepsToReduceBinaryToOne;

public class NoOfStepsToReduceBinaryStringToOneFinal extends AbstractParent {

    /**
     */
    @Override
    public int numSteps(String s) {
        int retVal = 0, carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            retVal++;
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                retVal++;
            }
        }
        return retVal + carry;
    }
}
