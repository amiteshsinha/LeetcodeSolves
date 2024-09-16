package com.leetcode.longestSubstringContainingEvenVowels;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * LongestSubstringContainingEvenVowels
 * 15/09/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findTheLongestSubstring(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findTheLongestSubstring("eleetminicoworoep"), 13);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findTheLongestSubstring("leetcodeisgreat"), 5);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findTheLongestSubstring("bcbcbc"), 6);
    }
}