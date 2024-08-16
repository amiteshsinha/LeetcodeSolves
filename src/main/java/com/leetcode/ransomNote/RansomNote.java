package com.leetcode.ransomNote;

public class RansomNote extends AbstractParent {

    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] ransomNoteFreqArr = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            ransomNoteFreqArr[ransomNote.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < magazine.length(); i++) {
            ransomNoteFreqArr[magazine.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++) {
            if (ransomNoteFreqArr[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
