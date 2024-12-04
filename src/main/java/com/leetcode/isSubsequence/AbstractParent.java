package com.leetcode.isSubsequence;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * isSubsequence
 * <p>
 * This file was created on 04/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean isSubsequence(String s, String t);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void should_give_correct_output_2() {
        assertFalse(isSubsequence("axc", "ahbgdc"));
    }

    @Test
    public void should_give_correct_output_3() {
        assertTrue(isSubsequence("ace", "abcde"));
    }

    @Test
    public void should_give_correct_output_4() {
        assertFalse(isSubsequence("aec", "abcde"));
    }
}
