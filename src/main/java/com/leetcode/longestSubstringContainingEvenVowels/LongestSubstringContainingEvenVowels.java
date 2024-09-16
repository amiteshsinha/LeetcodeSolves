package com.leetcode.longestSubstringContainingEvenVowels;

import java.util.Arrays;

public class LongestSubstringContainingEvenVowels extends AbstractParent {

    int[] characterMap = new int[26];
    int[] mp = new int[32];
    @Override
    public int findTheLongestSubstring(String s) {
        int prefixXOR = 0;
        characterMap['a' - 'a'] = 1;
        characterMap['e' - 'a'] = 2;
        characterMap['i' - 'a'] = 4;
        characterMap['o' - 'a'] = 8;
        characterMap['u' - 'a'] = 16;
        Arrays.fill(mp, -1);
        int longestSubstring = 0;
        for (int i = 0; i < s.length(); i++) {
            prefixXOR ^= characterMap[s.charAt(i) - 'a'];
            if (mp[prefixXOR] == -1 && prefixXOR != 0) {
                mp[prefixXOR] = i;
            }
            longestSubstring = Math.max(longestSubstring, i - mp[prefixXOR]);
        }
        return longestSubstring;
    }
}
