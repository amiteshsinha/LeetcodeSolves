package com.leetcode.shortestPalindrome;

public class ShortestPalindrome extends AbstractParent {
    //todo - solve it
    @Override
    public String shortestPalindrome(String s) {
        int[][] checkPalindrome2DArr = new int[s.length() + 1][s.length() + 1];
        int k = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 1 ; j < s.length() ; j--) {
                k = s.length() - j - 2;
                if (s.charAt(i - 1) == s.charAt(k)) {
                    checkPalindrome2DArr[i][j] = checkPalindrome2DArr[i - 1][j - 1] + 1;
                }
            }
        }
        System.out.println();
        return null;
    }
}
