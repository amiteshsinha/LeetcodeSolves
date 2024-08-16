package com.leetcode.MinNoOfPushesTypeWord;

import java.util.Arrays;

public class MinNoOfPushesToTypeWord extends AbstractParent {

    /**
     * Runtime
     * 8
     * ms
     * Beats
     * 91.92%
     *
     * Memory
     * 45.87
     * MB
     * Beats
     * 17.31%
     * @param word
     * @return
     */
    @Override
    public int minimumPushes(String word) {
        int retVal = 0, temp, multiplier = 1;
        //top 8 highest freq words have 1 key
        // next 8 have 2 and so on
        int[] wordFreqCount = new int[26];
        char[] charArr = word.toCharArray();
        for (char c : charArr) {
            temp = c - 'a';
            wordFreqCount[temp]++;
        }
        Arrays.sort(wordFreqCount);
        temp = 0;
        for (int i = 25; i >= 0; i--) {
            if (wordFreqCount[i] == 0) {
                break;
            }
            temp++;
            if (temp > 8*multiplier) {
                multiplier++;
            }
            retVal += wordFreqCount[i] * multiplier;
        }
        return retVal;
    }
}
