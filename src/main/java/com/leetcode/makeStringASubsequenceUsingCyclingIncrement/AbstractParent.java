package com.leetcode.makeStringASubsequenceUsingCyclingIncrement;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * makeStringSubsequenceUsingCyclicIncrement
 * <p>
 * This file was created on 04/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean canMakeSubsequence(String str1, String str2);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(canMakeSubsequence("abc", "ad"));
    }

    @Test
    public void should_give_correct_output_2() {
        assertTrue(canMakeSubsequence("zc", "ad"));
    }

    @Test
    public void should_give_correct_output_3() {
        assertFalse(canMakeSubsequence("ab", "d"));
    }
}
