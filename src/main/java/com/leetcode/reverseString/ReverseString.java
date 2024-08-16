package com.leetcode.reverseString;

public class ReverseString extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 48.72
     * MB
     * Beats
     * 61.64%
     * of users with Java
     * @param s
     */
    @Override
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0, j = s.length - 1; i < j; i++,j--) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
        }
    }
}
