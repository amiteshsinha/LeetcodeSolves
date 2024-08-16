package com.leetcode.passThePillow;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * PassThePillow
 * 07/07/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int passThePillow(int n, int time);

    @Test
    public void should_give_correct_output1() {
        assertEquals(passThePillow(4,5), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(passThePillow(3,2), 3);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(passThePillow(4,8), 3);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(passThePillow(4,7), 2);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(passThePillow(5,8), 1);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(passThePillow(5,9), 2);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(passThePillow(5,4), 5);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(passThePillow(5,5), 4);
    }
}