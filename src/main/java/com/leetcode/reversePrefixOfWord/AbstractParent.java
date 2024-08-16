package com.leetcode.reversePrefixOfWord;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ReversePrefixOfWord
 * 21/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String reversePrefix(String word, char ch);

    @Test
    public void should_give_correct_output1() {
        assertEquals(reversePrefix("abcdefd", 'd'), "dcbaefd");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(reversePrefix("xyxzxe", 'z'), "zxyxxe");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(reversePrefix("abcdefd", 'z'), "abcdefd");
    }
}