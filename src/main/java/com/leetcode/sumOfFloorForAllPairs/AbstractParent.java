package com.leetcode.sumOfFloorForAllPairs;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SumOfFloorForAllPairs
 * 23/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int getSumOfFloorForAllPairs(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getSumOfFloorForAllPairs(new int[]{3,3,4,4,5}), 17);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getSumOfFloorForAllPairs(new int[]{1,2,3,4,5}), 27);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getSumOfFloorForAllPairs(new int[]{2,2,4,4,8,8,8}), 61);
    }
}