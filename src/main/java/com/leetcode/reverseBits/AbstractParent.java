package com.leetcode.reverseBits;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ReverseBits
 * 10/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int reverseBits(int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(reverseBits(43261596), 964176192);
    }

    @Test
    public void should_give_correct_output2() {
        //assertEquals(reverseBits(4294967293), 3221225471);
    }

    @Test
    public void should_give_correct_output3() {
    }
}