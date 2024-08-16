package com.leetcode.longestBalanceSubstring.binaryArray;

public class LongestBalancedSubstringBinaryArray extends AbstractParent {

    /**
     * 2ms beats 60.85% users
     * @param s
     * @return
     */
    @Override
    public int findTheLongestBalancedSubstring(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }
        int index = 0, max = 0, currentStart = 0, currentMax = 0, left = 0, right = 0;
        while (index != -1) {
            index = s.indexOf("01", currentStart);
            if (index >= 0) {
                currentMax = 2;
                left = index - 1;
                right = index + 2;
                while (left >= 0 && right < s.length() && s.charAt(left) == '0' && s.charAt(right) == '1') {
                    currentMax +=2;
                    left--;
                    right++;
                }
                max = Math.max(currentMax, max);
                currentStart = right;
            } else {
                break;
            }
        }
        return max;
    }
}
