package com.leetcode.validPalindrome2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * ValidPalindrome2
 * 15/09/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean validPalindrome(String s);

    @Test
    public void should_give_correct_output1() {
        assertTrue(validPalindrome("aba"));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(validPalindrome("abca"));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(validPalindrome("abc"));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(validPalindrome("abcdba"));
    }

    @Test
    public void should_give_correct_output5() {
        assertTrue(validPalindrome("abcbda"));
    }

    @Test
    public void should_give_correct_output6() {
        assertTrue(validPalindrome("thannah"));
    }

    @Test
    public void should_give_correct_output7() {
        assertFalse(validPalindrome("thanntah"));
    }

    @Test
    public void should_give_correct_output8() {
        assertFalse(validPalindrome("misstidssim"));
    }

    @Test
    public void should_give_correct_output9() {
        assertTrue(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    @Test
    public void should_give_correct_output10() {
        assertTrue(validPalindrome("acxcybycxcxa"));
    }
}