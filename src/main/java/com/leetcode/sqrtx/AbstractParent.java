package com.leetcode.sqrtx;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SquareRootOfX
 * 24/06/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int mySqrt(int x);

    @Test
    public void should_give_correct_output1() {
        assertEquals(mySqrt(8), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(mySqrt(4), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(mySqrt(81), 9);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(mySqrt(2147395599), 46339);
    }
}