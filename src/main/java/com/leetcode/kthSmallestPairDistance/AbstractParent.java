package com.leetcode.kthSmallestPairDistance;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * KthSmallestPairDistance
 * 14/08/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int smallestDistancePair(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(smallestDistancePair(new int[]{1,3,1}, 1), 0);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(smallestDistancePair(new int[]{1,6,1}, 3), 5);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(smallestDistancePair(new int[]{1,3,1}, 2), 2);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(smallestDistancePair(new int[]{1,1,3,4,5,7,9,11}, 10), 4);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(smallestDistancePair(new int[]{62,100,4}, 2), 58);
    }
}