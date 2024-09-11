package com.leetcode.minBitFlitsConvertNo;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * MinBitFlitsToConvertNo
 * 11/09/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minBitFlips(int start, int goal);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minBitFlips(3, 4), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minBitFlips(10, 7), 3);
    }

    @Test
    public void should_give_correct_output3() {
    }
}