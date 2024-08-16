package com.leetcode.longestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring extends AbstractLongestSubstringTest {

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();
        int val = obj.lengthOfLongestSubstring("abcabcbb");
    }

    @Override
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxSoFar = Integer.MIN_VALUE, currentCount = 0;
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            characterSet.clear();
            currentCount = 0;
            for (int j = i; j < s.length(); j++) {
                if (!characterSet.contains(s.charAt(j))) {
                    characterSet.add(s.charAt(j));
                    currentCount++;
                } else {
                    break;
                }
            }
            if (currentCount > maxSoFar) {
                maxSoFar = currentCount;
            }
        }
        return maxSoFar;
    }
}
