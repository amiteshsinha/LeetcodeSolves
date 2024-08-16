package com.leetcode.validPalindrome;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * ValidPalindrome
 * 10/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isPalindrome(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(isPalindrome("  "));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertFalse(isPalindrome("race a car"));
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertTrue(isPalindrome(" a "));
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertTrue(isPalindrome(" A  t a"));
    }

    @Test
    public void should_give_correct_output6() {
        Assert.assertTrue(isPalindrome(".,"));
    }

    @Test
    public void should_give_correct_output7() {
        Assert.assertFalse(isPalindrome("0P"));
    }
}