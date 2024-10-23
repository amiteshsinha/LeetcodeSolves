package com.leetcode.sumOfPrefixScoresOfStrings;

import java.util.*;

/**
 *
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public class SumOfPrefixScoreOfStringsIter1 extends AbstractParent {

    /**
     * Memory limit exceeded
     * @param words
     * @return
     */
    @Override
    public int[] sumPrefixScores(String[] words) {
        Map<String, Integer> prefixCountMap = new HashMap<>();
        Map<String, Set<String>> prefixMap = new HashMap<>();
        int[] retArr = new int[words.length];
        String temp;
        for (String word : words) {
            for (int i = 1; i <= word.length(); i++) {
                temp = word.substring(0, i);
                prefixCountMap.put(temp, prefixCountMap.getOrDefault(temp, 0) + 1);
                prefixMap.computeIfAbsent(word, k -> new HashSet<>()).add(temp);
            }
        }
        for (int i = 0; i < words.length; i++) {
            Set<String> list = prefixMap.get(words[i]);
            for (String s : list) {
                retArr[i]+= prefixCountMap.get(s);
            }
        }
        return retArr;
    }

}
