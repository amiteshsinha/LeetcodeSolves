package com.leetcode.SortArrByIncreasingFreq;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SortArrayByIncreasingFreq
 * 24/07/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] frequencySort(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(frequencySort(new int[]{1,1,2,2,2,3}), new int[]{3,1,1,2,2,2});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(frequencySort(new int[]{2,3,1,3,2}), new int[]{1,3,3,2,2});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(frequencySort(new int[]{-1,1,-6,4,5,-6,1,4,1}), new int[]{5,-1,4,4,-6,-6,1,1,1});
    }
}