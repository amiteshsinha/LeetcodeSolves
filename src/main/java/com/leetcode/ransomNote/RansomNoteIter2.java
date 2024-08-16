package com.leetcode.ransomNote;

public class RansomNoteIter2 extends AbstractParent {

    /**
     */
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
//        for (char c = 'a'; c < 'z'; c++) {
        // every character gives a distinct value in mod
//            System.out.println(c + " : " + (int)c + " : " + c % 26);
//        }
        for (char c : ransomNote.toCharArray()) {
            int i = magazine.indexOf(c, arr[c % 26]);
            if (i == -1)
                return false;
            arr[c % 26] = i + 1;
        }
        return true;
    }
}
