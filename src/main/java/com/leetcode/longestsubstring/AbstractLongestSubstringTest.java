package com.leetcode.longestsubstring;

import org.junit.jupiter.api.Test;

public abstract class AbstractLongestSubstringTest {

    public static void main(String[] args) {
        AbstractLongestSubstringTest obj = new LongestSubstringOptSliding();
        System.out.println();
    }

    public abstract int lengthOfLongestSubstring(String s);

    @Test
    public void should_return_correct_substring_length1() {
        assert(lengthOfLongestSubstring("") == 0);
    }

    @Test
    public void should_return_correct_substring_length2() {
        assert(lengthOfLongestSubstring("bbbb") == 1);
    }

    @Test
    public void should_return_correct_substring_length3() {
        assert(lengthOfLongestSubstring("abcabcbb") == 3);
    }

    @Test
    public void should_return_correct_substring_length4() {
        assert(lengthOfLongestSubstring("pwwkew") == 3);
    }

    @Test
    public void should_return_correct_substring_length5() {
        assert(lengthOfLongestSubstring("lambergini") == 9);
    }

    @Test
    public void should_return_correct_substring_length6() {
        assert(lengthOfLongestSubstring(" ") == 1);
    }

    @Test
    public void should_return_correct_substring_length7() {
        assert(lengthOfLongestSubstring("  ") == 1);
    }

    @Test
    public void should_return_correct_substring_length8() {
        assert(lengthOfLongestSubstring("jcc") == 2);
    }

    @Test
    public void should_return_correct_substring_length9() {
        assert(lengthOfLongestSubstring("ajccjab") == 4);
    }
}
