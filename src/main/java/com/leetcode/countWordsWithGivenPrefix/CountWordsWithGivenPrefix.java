package com.leetcode.countWordsWithGivenPrefix;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 42.69
 * MB
 * Beats
 * 79.07%
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class CountWordsWithGivenPrefix extends AbstractParent {

    @Override
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

}
