package com.leetcode.plusOne;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * PlusOne
 * 28/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] plusOne(int[] digits);

    @Test
    public void should_give_correct_output1() {
        assertEquals(plusOne(new int[]{1,2,3}), new int[]{1,2,4});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(plusOne(new int[]{4,2,3,9}), new int[]{4,2,4,0});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(plusOne(new int[]{9}), new int[]{1,0});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(plusOne(new int[]{9,8}), new int[]{9,9});
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(plusOne(new int[]{9,9}), new int[]{1,0,0});
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(plusOne(new int[]{9,8,9,9}), new int[]{9,9,0,0});
    }
}