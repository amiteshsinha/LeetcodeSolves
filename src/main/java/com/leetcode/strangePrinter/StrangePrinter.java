package com.leetcode.strangePrinter;

public class StrangePrinter extends AbstractParent {

    @Override
    public int strangePrinter(String s) {
        int retVal = 1, max = 0, index = 0;
        char maxChar = 'a';
        int[] charCount = new int[26];
        char[] charPrintArr = s.toCharArray();
        for (char c : charPrintArr) {
            index = c - 'a';
            charCount[index]++;
            if (charCount[index] > max) {
                max = charCount[index];
                maxChar = c;
            }
        }
        int i = 0;
       while(i < charPrintArr.length) {
            if (charPrintArr[i] != maxChar) {
                retVal++;
                index = i + 1;
                while (index < charPrintArr.length && charPrintArr[i] == charPrintArr[index]) {
                    index++;
                }
                i = index;
            } else {
                i++;
            }
        }
        return retVal;
    }
}
