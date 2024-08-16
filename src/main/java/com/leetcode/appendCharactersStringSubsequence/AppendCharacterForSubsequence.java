package com.leetcode.appendCharactersStringSubsequence;

public class AppendCharacterForSubsequence extends AbstractParent {

    /**
     * Runtime
     * 7
     * ms
     * Beats
     * 51.85%
     * of users with Java
     * Memory
     * 45.51
     * MB
     * Beats
     * 13.88%
     * of users with Java
     *
     * @param s
     * @param t
     * @return
     */
    @Override
    public int appendCharacters(String s, String t) {
        if (s.contains(t)) {
            return 0;
        }
        int retVal = 0, tIndex = 0;
        int x = s.indexOf(t.charAt(tIndex));
        if (x >= 0) {
            // starting from the index of first character find out how many characters match
            for (int i = x; i < s.length() && tIndex < t.length(); i++) {
                if (s.charAt(i) == t.charAt(tIndex)) {
                    retVal++;
                    tIndex++;
                }
                if (retVal == t.length()) {
                    return 0;
                }
            }
        }
        return t.length() - retVal;
    }
}
