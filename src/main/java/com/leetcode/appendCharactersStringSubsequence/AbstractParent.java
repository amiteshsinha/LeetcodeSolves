package com.leetcode.appendCharactersStringSubsequence;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * AppendCharacterForSubsequence
 * 03/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int appendCharacters(String s, String t);

    @Test
    public void should_give_correct_output1() {
        assertEquals(appendCharacters("coaching", "coding"), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(appendCharacters("abcd", "a"), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(appendCharacters("z", "abcde"), 5);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(appendCharacters("coachdingla", "coding"), 0);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(appendCharacters("cacoachdingla", "coding"), 0);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(appendCharacters("cacoachdblingla", "coding"), 0);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(appendCharacters("coachingcod", "coding"), 3);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(appendCharacters("coachingcodbakin", "coding"), 1);
    }
}