package com.leetcode.countPrefixOfAGivenString;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 43.06
 * MB
 * Beats
 * 87.15%
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class countPrefixOfAGivenString extends AbstractParent {

    @Override
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (s.startsWith(word)) {
                count++;
            }
        }
        return count;
    }

}
