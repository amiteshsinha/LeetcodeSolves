package com.leetcode.validPalindrome;

public class ValidPalindrome extends AbstractParent {

    /**
     * Runtime
     * 2
     * ms
     * Beats
     * 99.06%
     * of users with Java
     * Memory
     * 42.50
     * MB
     * Beats
     * 95.75%
     * of users with Java
     * @param s
     * @return
     */
    @Override
    public boolean isPalindrome(String s) {
        //capital > 64 && < 91
        //small > 96 && < 123
        char[] charArr = s.toCharArray();
        int i = 0, j = 0;
        for (; j < charArr.length; j++) {
            int c =  charArr[j];
            if (c > 64 && c < 91) {
                charArr[j] = (char) (charArr[j] - 'A' + 'a');
            } else if (c > 47 && c < 58 || c > 96 && c < 123) {
                continue;
            } else {
                charArr[j] = 0;
            }
        }
         j--;
        while (i < j) {
            while (i < charArr.length && charArr[i] == 0) {
                i++;
            }
            while (j > 0 && charArr[j] == 0) {
                j--;
            }
            if (i < j && charArr[i] != charArr[j]) {
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
