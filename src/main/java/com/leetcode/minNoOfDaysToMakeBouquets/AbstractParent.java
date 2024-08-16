package com.leetcode.minNoOfDaysToMakeBouquets;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinDaysToMakeMBouquets
 * 19/06/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minDays(int[] bloomDay, int m, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minDays(new int[]{1,10,3,10,2}, 3, 1), 3);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minDays(new int[]{1,10,3,10,2}, 3, 2), -1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minDays(new int[]{7,7,7,7,12,7,7}, 2, 3), 12);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minDays(new int[]{8,7,7,6,6,3,7,2}, 2, 3), 7);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minDays(new int[]{8,7,7,6,6,3,7,2}, 4, 2), 8);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(minDays(new int[]{8,7,7,6,6,3,7,2}, 3, 2), 7);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(minDays(new int[]{8,7,7,6,6,3,7,2}, 2, 2), 7);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(minDays(new int[]{8,7,7,6,6,3,7,2}, 1, 2), 6);
    }
}