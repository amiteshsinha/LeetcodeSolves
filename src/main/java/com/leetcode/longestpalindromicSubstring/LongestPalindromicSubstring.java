package com.leetcode.longestpalindromicSubstring;

import org.junit.jupiter.api.Test;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int[][] palindromeMatrix = new int[s.length()][s.length()];
        if (s.length() < 2) {
            return s;
        }
        int maxSubstring = 0, maxSubstringPos = 0, length = s.length();
        for (int i = 0 ; i < length; i++) {
            char currentChar = s.charAt(length - 1 - i);
            for (int j = 0 ; j < length; j++) {
                if (s.charAt(j) == currentChar) {
                    if (i > 0 && j > 0 && palindromeMatrix[i - 1][j - 1] > 0) {
                        palindromeMatrix[i][j] = palindromeMatrix[i - 1][j - 1] + 1;
                        if (maxSubstring < palindromeMatrix[i][j]) {
                            maxSubstring = palindromeMatrix[i][j];
                            maxSubstringPos = j;
                        }
                    } else {
                        palindromeMatrix[i][j] = 1;
                    }
                }
            }
        }
        return s.substring(maxSubstringPos - maxSubstring + 1, maxSubstringPos + 1);
    }

    @Test
    public void should_return_correct_subString1() {
        assert (longestPalindrome("babed").equals("bab"));
    }

    @Test
    public void should_return_correct_subString2() {
        assert (longestPalindrome("dabad").equals("dabad"));
    }

    @Test
    public void should_return_correct_subString3() {
        assert (longestPalindrome("cbbd").equals("bb"));
    }

    @Test
    public void should_return_correct_subString4() {
        assert (longestPalindrome("c").equals("c"));
    }

    @Test
    public void should_return_correct_subString5() {
        assert (longestPalindrome("aacdefcaa").equals("aa"));
    }
}
