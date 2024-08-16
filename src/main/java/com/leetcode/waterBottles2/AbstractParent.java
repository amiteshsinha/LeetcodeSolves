package com.leetcode.waterBottles2;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * WaterBottles2
 * 07/07/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxBottlesDrunk(int numBottles, int numExchange);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maxBottlesDrunk(13,6),15);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maxBottlesDrunk(10,3),13);
    }

    @Test
    public void should_give_correct_output3() {
    }
}