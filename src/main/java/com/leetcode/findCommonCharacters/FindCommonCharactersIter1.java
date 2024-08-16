package com.leetcode.findCommonCharacters;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;

public class FindCommonCharactersIter1 extends AbstractParent {

    /**
     * @param words
     * @return
     */
    @Override
    public List<String> commonChars(String[] words) {
        int[] charFreqArr = countCharFreq(words[0]);
        List<String> retVal = new ArrayList<>();
        int[] temp;
        for (int i = 1; i < words.length; i++) {
            temp = countCharFreq(words[i]);
            for (int k = 0; k < 26; k++) {
                charFreqArr[k] = Math.min(charFreqArr[k] , temp[k]);
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charFreqArr[i] != 0) {
                char a = 'a';
                a += i;
                String t = valueOf(a);
                while (charFreqArr[i] > 0) {
                    retVal.add(t);
                    charFreqArr[i]--;
                }
            }
        }
        return retVal;
    }

    private int[] countCharFreq(String s) {
        int[] t = new int[26];
        for (char c : s.toCharArray()) {
            t[c - 'a']++;
        }
        return t;
    }
}
