package com.leetcode.permutationInString;

/**
 * Runtime
 * 308
 * ms
 * Beats
 * 12.92%
 *
 * Memory
 * 45.29
 * MB
 * Beats
 * 9.80%
 * s2 should contain a permutation of s1
 * This file was created on 05/10/24 / Saturday
 */
public class PermutationInString extends AbstractParent {

    @Override
    public boolean checkInclusion(String s1, String s2) {
        int[] charFreqArr = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        // get frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            charFreqArr[s1.charAt(i) - 'a']++;
        }
        int i = 0, count, j;
        while (i < s2.length()) {
            int[] s1FreqArr = charFreqArr.clone();
            count = s1.length();
            j = i;
            for (; j < s2.length(); j++) {
                // current char is present in s1
                if (s1FreqArr[s2.charAt(j) - 'a'] > 0) {
                    s1FreqArr[s2.charAt(j) - 'a']--;
                    count--;
                } else {
                    break;
                }
            }
            if (count == 0) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

}
