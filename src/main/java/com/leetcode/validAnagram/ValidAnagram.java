package com.leetcode.validAnagram;

import java.util.Arrays;

public class ValidAnagram extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 88.49%
     * Memory
     * 44.15
     * MB
     * Beats
     * 57.22%
     * @param s
     * @param t
     * @return
     */
    @Override
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
}
