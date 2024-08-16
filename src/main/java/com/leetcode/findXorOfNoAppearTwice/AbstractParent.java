package com.leetcode.findXorOfNoAppearTwice;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * XorOfNoAppearingTwice
 * 28/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int duplicateNumbersXOR(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(duplicateNumbersXOR(new int[]{1,2,1,3}), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(duplicateNumbersXOR(new int[]{1,2,3}), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(duplicateNumbersXOR(new int[]{1,2,1,2}), 3);
    }
}