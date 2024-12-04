package com.leetcode.isSubsequence;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 93.46%
 * Analyze Complexity
 * Memory
 * 41.52
 * MB
 * Beats
 * 30.04%
 * This file was created on 04/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class isSubsequence extends AbstractParent {

    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0, slen = s.length(), tlen = t.length();
        while (j < slen && i < tlen) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            i++;
        }
        return j == slen;
    }

}
