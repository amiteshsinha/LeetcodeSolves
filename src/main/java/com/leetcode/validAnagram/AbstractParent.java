package com.leetcode.validAnagram;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

/**
 * ValidAnagram
 * 14/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean isAnagram(String s, String t);

    @Test
    public void should_give_correct_output1() {
        assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertFalse(isAnagram("rat", "car"));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertFalse(isAnagram("ac", "bb"));
    }
}