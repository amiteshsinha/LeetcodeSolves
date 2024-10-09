package com.leetcode.minAddMakeParanthesesValid;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 41.32
 * MB
 * Beats
 * 64.62%
 * This file was created on 09/10/24 / Wednesday
 */
public class MinAddToMakeParanthesesValid extends AbstractParent {

    @Override
    public int minAddToMakeValid(String s) {
        int currentSet = 0, retVal = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (currentSet < 0) {
                    retVal = retVal - currentSet;
                    currentSet = 0;
                }
                currentSet++;
            } else if (s.charAt(i) == ')') {
                currentSet--;
            }
        }
        retVal += Math.abs(currentSet);
        return retVal;
    }

}
