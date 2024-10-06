package com.leetcode.sentenceSimilarity3;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * SentenceSimilarity3
 * This file was created on 06/10/24 / Sunday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean areSentencesSimilar(String sentence1, String sentence2);

    @Test
    public void should_give_correct_output1() {
        assertTrue(areSentencesSimilar("My name is Haley","My Haley"));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(areSentencesSimilar("of","A lot of words"));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(areSentencesSimilar("Eating right now","Eating"));
    }

    @Test
    public void should_give_correct_output4() {
        assertFalse(areSentencesSimilar("Frog cool","Frogs are cool"));
    }

    @Test
    public void should_give_correct_output5() {
        assertTrue(areSentencesSimilar("Frog","Frogs are cool Frog"));
    }

    @Test
    public void should_give_correct_output6() {
        assertTrue(areSentencesSimilar("Frog cool Frog","Frog Bull Frog cool Frog"));
    }

    @Test
    public void should_give_correct_output7() {
        assertTrue(areSentencesSimilar("Frog cool Frog","True Frog Bull Frog cool Frog"));
    }
}
