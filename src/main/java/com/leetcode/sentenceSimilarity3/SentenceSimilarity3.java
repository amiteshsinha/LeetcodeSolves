package com.leetcode.sentenceSimilarity3;

/**
 * Runtime
 * 1
 * ms
 * Beats
 * 96.43%
 *
 * Memory
 * 41.15
 * MB
 * Beats
 * 98.41%
 * This file was created on 06/10/24 / Sunday
 */
public class SentenceSimilarity3 extends AbstractParent {

    @Override
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1List = sentence1.split(" ");
        String[] s2List = sentence2.split(" ");
        return (s1List.length > s2List.length) ? compareStringArr(s1List, s2List) : compareStringArr(s2List, s1List);
    }

    // s1 list is always bigger than or equal to s2
    private boolean compareStringArr(String[] s1List, String[] s2List) {
        // either start is equal or end is equal or both
        int i = 0, j1 = s1List.length - 1, j2 = s2List.length - 1, j = 0;
        // start from forward - and then count number of matches
        // start from back and count number of matches
        // if total is more than diff then true
        if (s1List[0].equals(s2List[0])) {
            while (i < s1List.length && i < s2List.length && s1List[i].equals(s2List[i])) {
                i++;
            }
            if (s1List[j1].equals(s2List[j2])) {
                while (j1 >= 0 && j2 >= 0 && s1List[j1].equals(s2List[j2])) {
                    j1--;
                    j2--;
                    j++;
                }
                return (i + j >= s2List.length) ? true : false;
            }
            return (i == s2List.length) ? true : false;
        } else if (s1List[j1].equals(s2List[j2])) {
            while (j1 >= 0 && j2 >= 0 && s1List[j1].equals(s2List[j2])) {
                j1--;
                j2--;
                j++;
            }
            return (j == s2List.length) ? true : false;
        } else {
            return false;
        }
    }
}
