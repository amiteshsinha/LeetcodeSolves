package com.leetcode.longestsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * For each unique element that we find - we save the index of that element (index = pos + 1)
 * We take 2 counters i and j  - j moves for every element, i does not move until we find a character
 * which we encountered earlier - when this happens - i is updated to the current index of that character
 * if and only if the current index of the character is greater than i
 */
public class LongestSubstringOptSliding extends AbstractLongestSubstringTest {

    @Override
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }
}
