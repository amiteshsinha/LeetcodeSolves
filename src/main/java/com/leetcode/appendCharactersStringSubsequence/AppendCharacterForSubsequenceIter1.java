package com.leetcode.appendCharactersStringSubsequence;

public class AppendCharacterForSubsequenceIter1 extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 44.94
     * MB
     * Beats
     * 89.81%
     * of users with Java
     *
     * @param s
     * @param t
     * @return
     */
    @Override
    public int appendCharacters(String s, String t) {
        if (s.equals(t)) {
            return 0;
        }
        int retVal = 0, tIndex = 0, sl = s.length(), tl = t.length();
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        // starting from the index of first character find out how many characters match
        for (int i = 0; i < sl; i++) {
            if (sArr[i] == tArr[tIndex]) {
                retVal++;
                tIndex++;
            }
            if (tIndex == tl) {
                return 0;
            }
        }

        return tl - retVal;
    }
}
