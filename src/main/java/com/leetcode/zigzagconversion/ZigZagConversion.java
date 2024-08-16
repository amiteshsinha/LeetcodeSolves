package com.leetcode.zigzagconversion;

public class ZigZagConversion extends AbstractParent {

    @Override
    public String convert(String s, int numRows) {
        int colFinal = 0;
        if (numRows == 1) {
            return s;
        }
        int length = s.length();
        boolean forward = true;
        if (length > numRows) {
            int intermediary = (numRows > 2) ? numRows - 2 : 0;
            while (length > 0) {
                if (forward) {
                    length = length - numRows;
                    colFinal++;
                    forward = false;
                } else {
                    if (length > intermediary) {
                        colFinal = colFinal + intermediary;
                    } else {
                        colFinal = colFinal + length;
                    }
                    length = length - intermediary;
                    forward = true;
                }
            }
        } else {
            colFinal = 1;
        }
        forward = true;
        char[][] arr = new char[numRows][colFinal];
        int i = 0, j = 0, index = 0;

        while (index != s.length()) {
            arr[i][j] = s.charAt(index);
            if (i == numRows - 1) {
                forward = false;
            }
            if (i == 0) {
                forward = true;
            }
            if (forward) {
                i++;
            } else {
                i--;
                j++;
            }
            index++;
        }
        StringBuilder stringBuffer = new StringBuilder();
        for (i = 0; i < numRows; i++) {
            for (j = 0; j < colFinal; j++) {
                if (arr[i][j] > 0) {
                    stringBuffer.append(arr[i][j]);
                    if (stringBuffer.length() == s.length()) {
                        break;
                    }
                }
            }
            if (stringBuffer.length() == s.length()) {
                break;
            }
        }
        return stringBuffer.toString();
    }
}
