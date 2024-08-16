package com.leetcode.wordPattern;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * WordPattern
 * 13/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean wordPattern(String pattern, String s);

    @Test
    public void should_give_correct_output1() {
        assertFalse(wordPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void should_give_correct_output4() {
        assertFalse(wordPattern("aaaa", "dog cat cat dog"));
    }
}