package com.leetcode.longestPalindromeLength;

public class LongestPalindromeIter1 extends AbstractParent {

    /**
     *Runtime
     * 1
     * ms
     * Beats
     * 100.00%
     * of users with Java
     * Memory
     * 41.53
     * MB
     * Beats
     * 71.92%
     * of users with Java
     * @param s
     * @return
     */
    @Override
    public int longestPalindrome(String s) {
        int[] countArr = new int[60];
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            countArr[charArr[i] - 'A']++;
        }
        int retVal = 0;
        for (int i = 0; i < countArr.length; i++) {
                if (countArr[i]%2 != 0) {
                    retVal++;
                }
        }
        return (retVal > 0) ? s.length() - retVal + 1 : s.length();
    }
}
