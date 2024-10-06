package com.leetcode.sentenceSimilarity3;

/**
 * Performance is same as original approach but this is a little cleaner
 * Runtime
 * 1
 * ms
 * Beats
 * 96.43%
 *
 * Memory
 * 41.45
 * MB
 * Beats
 * 83.33%
 * This file was created on 06/10/24 / Sunday
 */
public class SentenceSimilarity3Iter1 extends AbstractParent {

    @Override
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] s1List = sentence1.split(" ");
        String[] s2List = sentence2.split(" ");
        // s1 list is always bigger than or equal to s2
        // either start is equal or end is equal or both
        int i = 0, j1 = s1List.length - 1, j2 = s2List.length - 1;
        // start from forward - and then count number of matches
        while (i < s2List.length && s1List[i].equals(s2List[i])) {
            i++;
        }
        // start from back and count number of matches
        while (j2 >= 0 && s1List[j1].equals(s2List[j2])) {
            j1--;
            j2--;
        }
        // if total is more than diff then true - this statement j2 < i means that for the shorter string
        // String2  - the right pointer has crossed the left pointer
        return j2 < i;
    }
}
