package com.leetcode.climbingStairs;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ClimbingStairs
 * 28/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int climbStairs(int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(climbStairs(3), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(climbStairs(4), 5);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(climbStairs(5), 8);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(climbStairs(6), 13);
    }
}