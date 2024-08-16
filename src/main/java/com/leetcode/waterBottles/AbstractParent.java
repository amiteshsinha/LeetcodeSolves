package com.leetcode.waterBottles;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * WaterBottles
 * 07/07/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numWaterBottles(int numBottles, int numExchange);

    @Test
    public void should_give_correct_output1() {
        assertEquals(numWaterBottles(9,3),13);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(numWaterBottles(15,4),19);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(numWaterBottles(16,4),21);
    }
}