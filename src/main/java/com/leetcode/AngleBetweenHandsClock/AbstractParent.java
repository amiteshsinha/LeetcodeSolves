package com.leetcode.AngleBetweenHandsClock;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * AngleBetweenHandsClock
 * 07/07/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract double angleClock(int hour, int minutes);

    @Test
    public void should_give_correct_output1() {
        assertEquals(angleClock(3,30), 75);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(angleClock(12,30), 165);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(angleClock(3,15), 7.5);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(angleClock(1,57), 76.5);
    }
}