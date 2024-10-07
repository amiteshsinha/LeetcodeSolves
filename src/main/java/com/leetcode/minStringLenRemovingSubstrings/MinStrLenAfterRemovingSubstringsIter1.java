package com.leetcode.minStringLenRemovingSubstrings;

/**
 * Runtime
 * 4
 * ms
 * Beats
 * 85.00%
 *
 * Memory
 * 42.77
 * MB
 * Beats
 * 98.52%
 * This file was created on 07/10/24 / Monday
 */
public class MinStrLenAfterRemovingSubstringsIter1 extends AbstractParent {

    @Override
    public int minLength(String s) {
        char[] charArr = s.toCharArray();
        charArr = getFinalCharArr(charArr);
        int retVal = 0;
        for (int i = 0; i < charArr.length;i++) {
            if (charArr[i] != 1) {
               retVal++;
            }
        }
        return retVal;
    }

    private char[] getFinalCharArr(char[] charArr) {
        int j;
        boolean isChanged = false;
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == 'A') {
                j = i + 1;
                while (j < charArr.length) {
                    if (charArr[j] == 'B') {
                        charArr[i] = 1;
                        charArr[j] = 1;
                        isChanged = true;
                        break;
                    } else if (charArr[j] == 1) {
                        j++;
                    } else {
                        break;
                    }
                }
            } else if (charArr[i] == 'C') {
                j = i + 1;
                while (j < charArr.length) {
                    if (charArr[j] == 'D') {
                        charArr[i] = 1;
                        charArr[j] = 1;
                        isChanged = true;
                        break;
                    } else if (charArr[j] == 1) {
                        j++;
                    } else {
                        break;
                    }
                }
            }
        }
        if (isChanged) {
            return getFinalCharArr(charArr);
        }
        return charArr;
    }

}
