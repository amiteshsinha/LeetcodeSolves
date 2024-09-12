package com.leetcode.countNoOfConsistentStrings;

public class CountNoOfConsistentStrings extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 45.28
     * MB
     * Beats
     * 62.99%
     * @param allowed
     * @param words
     * @return
     */
    @Override
    public int countConsistentStrings(String allowed, String[] words) {
        int retCount = 0;
        boolean[] isPresent = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            isPresent[allowed.charAt(i) - 'a'] = true;
        }
        for (String s : words) {
            if (isConsistent(s, isPresent)){
                retCount++;
            }
        }
        return retCount;
    }

    private boolean isConsistent(String s, boolean[] isPresent ) {
        for (int i = 0; i < s.length(); i++) {
            if (!isPresent[s.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}
