package com.leetcode.validPalindrome2;

public class ValidPalindrome2 extends AbstractParent {

    @Override
    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1, count = 0, charCount = 0;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                charCount += 2;
            } else {
                if ((j - i) > 1) {
                    if (s.charAt(i + 1) == s.charAt(j)) {
                        i++;
                        charCount++;
                        count++;
                    } else if (s.charAt(i) == s.charAt(j - 1)) {
                        j--;
                        charCount++;
                        count++;
                    } else {
                        return false;
                    }
                } else {
                    count++;
                    charCount++;
                    break;
                }
            }
            if (count > 1) {
                return false;
            }
        }
        if (charCount >= s.length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
