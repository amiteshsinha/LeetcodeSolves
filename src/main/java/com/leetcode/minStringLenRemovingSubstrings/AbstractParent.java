package com.leetcode.minStringLenRemovingSubstrings;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinStrLenAfterRemovingSubstrings
 * This file was created on 07/10/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int minLength(String s);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minLength("ABFCACDB"), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minLength("ACBBD"), 5);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minLength("CCDAABBDCD"), 0);
    }
}
