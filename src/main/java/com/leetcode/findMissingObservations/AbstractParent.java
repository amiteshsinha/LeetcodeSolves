package com.leetcode.findMissingObservations;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MissingDiceObservations
 * 08/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] missingRolls(int[] rolls, int mean, int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(missingRolls(new int[]{3,2,4,3}, 4,2), new int[]{6,6});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(missingRolls(new int[]{1,5,6}, 3,4), new int[]{3,2,2,2});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(missingRolls(new int[]{1,2,3,4}, 6,4), new int[]{});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(missingRolls(new int[]{1,5,6}, 4,3), new int[]{4,4,4});
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(missingRolls(new int[]{1,5,6,6}, 4,4), new int[]{4,4,3,3});
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(missingRolls(new int[]{4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5}, 4,40),
                new int[]{5,5,5,5,5,5,5,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4});
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(missingRolls(new int[]{3,5,3}, 5,3), new int[]{});
    }
}