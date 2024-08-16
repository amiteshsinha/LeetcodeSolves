package com.leetcode.minDiffLargestAndSmallest;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MinDiffLargestSmallest3Moves
 * 03/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minDifference(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minDifference(new int[]{5,3,2,4}), 0);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minDifference(new int[]{1,5,0,10,4}), 1);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minDifference(new int[]{7,10,100}), 0);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minDifference(new int[]{1,5,0,10,4,3}), 2);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minDifference(new int[]{200,100,50,30,15,11,10,9,8,7,6}), 24);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(minDifference(new int[]{-15,-10,-9,-5,-3}), 1);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(minDifference(new int[]{1,5,0,10,14,3}), 3);
    }
}