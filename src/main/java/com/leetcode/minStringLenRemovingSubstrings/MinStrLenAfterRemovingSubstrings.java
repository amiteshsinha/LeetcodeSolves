package com.leetcode.minStringLenRemovingSubstrings;

/**
 * Runtime
 * 7
 * ms
 * Beats
 * 36.18%
 *
 * Memory
 * 44.96
 * MB
 * Beats
 * 13.95%
 * This file was created on 07/10/24 / Monday
 */
public class MinStrLenAfterRemovingSubstrings extends AbstractParent {

    @Override
    public int minLength(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') || (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D')) {
                return minLength(s.substring(0, i) + s.substring(i + 2));
            }
        }
        return s.length();
    }

}
