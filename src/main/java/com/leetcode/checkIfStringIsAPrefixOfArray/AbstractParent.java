package com.leetcode.checkIfStringIsAPrefixOfArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * CheckIfStringIsAPrefixOfArray
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean isPrefixString(String s, String[] words);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(isPrefixString("iloveleetcode", new String[]{"i","love","leetcode","apples"}));
    }

    @Test
    public void should_give_correct_output_2() {
        assertFalse(isPrefixString("iloveleetcode", new String[]{"apples","i","love","leetcode"}));
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
