package com.leetcode.subArrayDivisibleByK;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SubArraySumDivisibleByK
 * 09/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int subarraysDivByK(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5), 7);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(subarraysDivByK(new int[]{5}, 9), 0);
    }

    @Test
    public void should_give_correct_output3() {
    }
}