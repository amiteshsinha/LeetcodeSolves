package com.leetcode.countNoOfConsistentStrings;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * CountNoOfConsistentStrings
 * 12/09/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int countConsistentStrings(String allowed, String[] words);

    @Test
    public void should_give_correct_output1() {
        assertEquals(countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}), 7);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}), 4);
    }
}