package com.leetcode.validAnagram;

public class ValidAnagramBetter extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.77%
     *
     * Memory
     * 42.99
     * MB
     * Beats
     * 76.36%
     * @param s
     * @param t
     * @return
     */
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int[] freqArr = new int[26];
        int k;
        for (char c : sChar) {
            freqArr[c - 'a']++;
        }
        for (char c : tChar) {
            k = c - 'a';
            if (freqArr[k] < 1) {
                return false;
            }
            freqArr[k]--;
        }
        return true;
    }
}
