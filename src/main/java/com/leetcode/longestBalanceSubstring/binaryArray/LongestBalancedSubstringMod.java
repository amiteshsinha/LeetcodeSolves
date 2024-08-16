package com.leetcode.longestBalanceSubstring.binaryArray;

public class LongestBalancedSubstringMod extends AbstractParent {

    @Override
    public int findTheLongestBalancedSubstring(String s) {
        int length = s.length(), max = 0, countZero , countOne;
        for (int i = 0; i < length; i++) {
            countZero = 0;
            countOne = 0;
            if (s.charAt(i) == '1') {
                int k = i-1;
                while (k >= 0 && s.charAt(k) == '0') {
                    countZero++;
                    k--;
                }
                k = i;
                if (countZero > 0) {
                    while (k < length && s.charAt(k) == '1') {
                        countOne++;
                        k++;
                    }
                    max = Math.max(Math.min(countOne,countZero)*2 , max);
                }
            }
        }
        return max;
    }
}
