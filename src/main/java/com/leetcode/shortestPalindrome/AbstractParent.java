package com.leetcode.shortestPalindrome;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * ShortestPalindrome
 * 20/09/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String shortestPalindrome(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(shortestPalindrome("aacecaaa"), "aaacecaaa");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(shortestPalindrome("abcd"), "dcbabcd");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(shortestPalindrome("cecda"), "adcecda");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(shortestPalindrome("kcecda"), "adceckcecda");
    }
}