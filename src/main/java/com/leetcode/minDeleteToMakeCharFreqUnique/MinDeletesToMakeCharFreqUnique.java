package com.leetcode.minDeleteToMakeCharFreqUnique;

import java.util.HashSet;
import java.util.Set;

public class MinDeletesToMakeCharFreqUnique extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 97.02%
     *
     * Memory
     * 44.62
     * MB
     * Beats
     * 98.88%
     * @param s
     * @return
     */
    @Override
    public int minDeletions(String s) {
        int[] freqArr = new int[26];
        int count = 0;
        char[] charArr = s.toCharArray();
        for (char c : charArr) {
            freqArr[c - 'a']++;
        }
        Set<Integer> freqSet = new HashSet<>();
        freqSet.add(0);
        for (int i : freqArr) {
            while (i > 0 && freqSet.contains(i)) {
                i--;
                count++;
            }
            freqSet.add(i);
        }
        return count;
    }
}
