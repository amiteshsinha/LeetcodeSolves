package com.leetcode.degreeOfAnArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * DegreeOfAnArray
 * 20/07/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findShortestSubArray(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findShortestSubArray(new int[]{1,2,2,3,1}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findShortestSubArray(new int[]{1,2,2,3,1,4,2}), 6);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findShortestSubArray(new int[]{1,2,2,3,1,4,2,3,3,9,3}), 8);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(findShortestSubArray(new int[]{1,2,3}), 1);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(findShortestSubArray(new int[]{1}), 1);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(findShortestSubArray(new int[]{1,1}), 2);
    }
}