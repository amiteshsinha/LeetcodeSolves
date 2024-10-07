package com.leetcode.minStringLenRemovingSubstrings;

/**
 * Runtime
 * 2
 * ms
 * Beats
 * 97.04%
 *
 * Memory
 * 42.71
 * MB
 * Beats
 * 98.52%
 * This file was created on 07/10/24 / Monday
 */
public class MinStrLenAfterRemovingSubstringsIter2 extends AbstractParent {

    @Override
    public int minLength(String s) {
        char[] charArr = s.toCharArray();
        int retval = charArr.length, i = 0, j;
        while( i < charArr.length - 1) {
            j = i + 1;
            while ((charArr[i] == 'A' && charArr[j] == 'B') ||
                    (charArr[i] == 'C' && charArr[j] == 'D')) {
                charArr[i] = 1;
                charArr[j] = 1;
                retval -= 2;
                if (i > 0 && j < charArr.length - 1) {
                    while (i > 0 && charArr[i] == 1) {
                        i--;
                    }
                    while (j < charArr.length && charArr[j] == 1) {
                        j++;
                    }
                } else {
                    break;
                }
            }
            i = j;
        }
        return retval;
    }

}
