package com.leetcode.minDeleteToMakeCharFreqUnique;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinDeletesToMakeCharFreqUnique
 * 01/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minDeletions(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minDeletions("aab"), 0);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minDeletions("aaabbbcc"), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minDeletions("ceabaacb"), 2);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minDeletions("bbcebab"), 2);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minDeletions("abcabc"), 3);
    }
}