package com.leetcode.permutationInString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * PermutationInString
 * This file was created on 05/10/24 / Saturday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean checkInclusion(String s1, String s2);

    @Test
    public void should_give_correct_output1() {
        assertTrue(checkInclusion("ab", "eidbaooo"));
    }

    @Test
    public void should_give_correct_output2() {
        assertFalse(checkInclusion("ab", "eidboaoo"));
    }

    @Test
    public void should_give_correct_output3() {
        assertTrue(checkInclusion("abccd", "ebcccbadoo"));
    }
}
