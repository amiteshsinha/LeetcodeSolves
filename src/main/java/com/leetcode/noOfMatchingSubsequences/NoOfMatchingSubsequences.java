package com.leetcode.noOfMatchingSubsequences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This file was created on 11/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class NoOfMatchingSubsequences extends AbstractParent {

    @Override
    public int numMatchingSubseq(String s, String[] words) {
        int countSubseq = 0, i , lastIndex;
        Set<String> isSubsetSet = new HashSet<>();
        int[] isCharPresentArr = new int[26];
        Arrays.fill(isCharPresentArr, -1);
        for (i = 0; i < s.length(); i++) {
            isCharPresentArr[s.charAt(i) - 'a'] = i;//last index of the char
        }
        for (String word : words) {
            if (isSubsetSet.contains(word)) {
                countSubseq++;
                continue;
            }
            i = 0;
            lastIndex = -1;
            for (int j = 0; j < s.length(); j++) {
                if (i == word.length()) {
                    break;
                }
                char c = s.charAt(j);
                if (isCharPresentArr[word.charAt(i) - 'a'] == -1) {
                    break;
                }
                if (lastIndex > 0 && lastIndex > isCharPresentArr[word.charAt(i) - 'a'] || j > isCharPresentArr[word.charAt(i) - 'a']) {
                   break;
                }
                if (c == word.charAt(i)) {
                    lastIndex = j;
                    i++;
                }
            }
            if (i == word.length()) {
                countSubseq++;
                isSubsetSet.add(word);
            }
        }
        return countSubseq;
    }

}
