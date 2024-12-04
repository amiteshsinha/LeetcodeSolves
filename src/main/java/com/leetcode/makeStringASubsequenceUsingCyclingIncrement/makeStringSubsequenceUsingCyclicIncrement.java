package com.leetcode.makeStringASubsequenceUsingCyclingIncrement;

/**
 * Runtime
 * 5
 * ms
 * Beats
 * 100.00%
 *<p>
 * Memory
 * 45.52
 * MB
 * Beats
 * 53.29%
 *<p>
 * This file was created on 04/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class makeStringSubsequenceUsingCyclicIncrement extends AbstractParent {

    @Override
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        char c, d;
        while(i < str1.length() && j < str2.length()) {
            c = str1.charAt(i);
            d = str2.charAt(j);
            if (d - c == 0 || d - c == 1 || c == 'z' && d == 'a') {
                j++;
            }
            i++;
        }
        return j == str2.length();
    }

}
