package com.leetcode.MinNoOfPushesTypeWord;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinNoOfPushesToTypeWord
 * 06/08/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minimumPushes(String word);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minimumPushes("abcde"), 5);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minimumPushes("xyzxyzxyzxyz"), 12);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minimumPushes("aabbccddeeffgghhiiiiii"), 24);
    }
}