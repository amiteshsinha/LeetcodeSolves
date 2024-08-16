package com.leetcode.LongestCommonPrefix;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefix {

    /**
     * Solution algo - we take the 1st 2 and find the longest common prefix
     * And we maintain a counter for length -
     * if the counter becomes 0 - no need to check further - return empty string
     * else take the prefix string and find the longest common prefix between it and the next string
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }
        if (strs.length < 2) {
            return strs[0];
        }
        String retVal = longestCommonPrefix(strs[1], strs[0]);
        if (retVal.length() == 0) {
            return "";
        }
        if (strs.length > 2) {
            for (int i = 2; i < strs.length; i++) {
                retVal = longestCommonPrefix(retVal, strs[i]);
                if (retVal.length() == 0) {
                    return "";
                }
            }
        }
        return retVal;
    }

    private String longestCommonPrefix(String stringA, String stringB) {
        if (stringA.length() > 0 && stringB.length() > 0) {
            int i = 0, j = 0;
            for (; i < stringA.length() && j < stringB.length(); i++, j++) {
                if (stringA.charAt(i) != stringB.charAt(j)) {
                    break;
                }
            }
            if (i > 0) {
                return stringA.substring(0, i);
            }
        }
        return "";
    }

    @Test
    public void should_return_valid_longest_prefix() {
        String[] arr = {"flower","flow","flight"};
        assert longestCommonPrefix(arr).equals("fl");
    }

    @Test
    public void should_return_empty_string() {
        String[] arr = {"dog","racecar","car"};
        assert longestCommonPrefix(arr).equals("");
    }

    @Test
    public void should_return_valid_longest_prefix2() {
        String[] arr = {"flower","flow","flower"};
        assert longestCommonPrefix(arr).equals("flow");
    }

    @Test
    public void should_return_valid_longest_prefix3() {
        String[] arr = {"flower","flow","flower"};
        assert longestCommonPrefix(arr).equals("flow");
    }

    @Test
    public void should_return_valid_longest_prefix4() {
        String[] arr = {"flower","flower"};
        assert longestCommonPrefix(arr).equals("flower");
    }
}
