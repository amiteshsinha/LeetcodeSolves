package com.leetcode.ransomNote;

public class RansomNoteIter1 extends AbstractParent {

    /**
     * Runtime
     * 1
     * ms
     * Beats
     * 99.10%
     * of users with Java
     * Memory
     * 44.74
     * MB
     * Beats
     * 59.01%
     * of users with Java
     * @param ransomNote
     * @param magazine
     * @return
     */
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] ransomNoteFreqArr = new int[26];
        int k;
        for (int i = 0; i < magazine.length(); i++) {
            ransomNoteFreqArr[magazine.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            k = ransomNote.charAt(i) - 'a';
            ransomNoteFreqArr[k] += 1;
            if (ransomNoteFreqArr[k] > 0) {
                return false;
            }
        }
        return true;
    }
}
