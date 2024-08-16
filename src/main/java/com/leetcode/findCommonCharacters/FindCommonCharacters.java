package com.leetcode.findCommonCharacters;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters extends AbstractParent {

    /**
     * Runtime
     * 3
     * ms
     * Beats
     * 88.78%
     * of users with Java
     * Memory
     * 43.02
     * MB
     * Beats
     * 57.80%
     * of users with Java
     * @param words
     * @return
     */
    @Override
    public List<String> commonChars(String[] words) {
        int[] charFreqArr = new int[26];
        List<String> retVal = new ArrayList<>();
        char[] wordCharArr = words[0].toCharArray();
        for (int j = 0; j < wordCharArr.length; j++) {
            charFreqArr[wordCharArr[j] - 'a']++;
        }
        int[] temp;
        for (int i = 1; i < words.length; i++) {
            wordCharArr = words[i].toCharArray();
            temp = new int[26];
            for (int j = 0; j < wordCharArr.length; j++) {
                temp[wordCharArr[j] - 'a']++;
            }
            for (int k = 0; k < 26; k++) {
                charFreqArr[k] = Math.min(charFreqArr[k] , temp[k]);
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charFreqArr[i] != 0) {
                String t = (char) ('a' + i) + "";
                for (int j = 0; j < charFreqArr[i]; j++) {
                    retVal.add(t);
                }
            }
        }
        return retVal;
    }
}
