package com.leetcode.countNoOfConsistentStrings;

public class CountNoOfConsistentStrings extends AbstractParent {

    /**
     * Runtime
     * 5
     * ms
     * Beats
     * 96.90%
     *
     * Memory
     * 45.06
     * MB
     * Beats
     * 85.93%
     * @param allowed
     * @param words
     * @return
     */
    @Override
    public int countConsistentStrings(String allowed, String[] words) {
        int retCount = words.length;
        char[] charArr = allowed.toCharArray();
        boolean[] isPresent = new boolean[26];
        for (char c: charArr) {
            isPresent[c - 'a'] = true;
        }
        outer :
        for (String s : words) {
            charArr = s.toCharArray();
            for (char c : charArr) {
                if (!isPresent[c - 'a']) {
                    continue outer;
                }
            }
            retCount++;
        }
        return retCount;
    }
}
