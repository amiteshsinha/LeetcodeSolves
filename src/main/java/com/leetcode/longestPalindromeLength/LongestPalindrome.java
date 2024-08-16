package com.leetcode.longestPalindromeLength;

public class LongestPalindrome extends AbstractParent {

    /**
     * Runtime
     * 129
     * ms
     * Beats
     * 7.63%
     * of users with Java
     * Memory
     * 40.90
     * MB
     * Beats
     * 99.55%
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
        int retVal = 0, oddCount = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] > 0) {
                if (countArr[i]%2 == 0) {
                    retVal += countArr[i];
                } else {
                    retVal += countArr[i] - 1;
                    oddCount += countArr[i];
                }
            }
        }
        return (oddCount > 0) ? retVal + 1 : retVal;
    }
}
