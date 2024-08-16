package com.leetcode.minMovesToSeat;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinMovesToSeatEveryone
 * 13/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minMovesToSeat(int[] seats, int[] students);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}), 4);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6}), 7);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minMovesToSeat(new int[]{2,2,6,6}, new int[]{1,3,2,6}), 4);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minMovesToSeat(new int[]{12,14,19,19,12}, new int[]{19,2,17,20,7}), 19);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minMovesToSeat(new int[]{7}, new int[]{11}), 4);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(minMovesToSeat(new int[]{12,14}, new int[]{2,17}), 13);
    }
}