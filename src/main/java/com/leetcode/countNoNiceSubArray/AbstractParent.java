package com.leetcode.countNoNiceSubArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * CountNoOfNiceSubarrays
 * 22/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numberOfSubarrays(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(numberOfSubarrays(new int[]{1,1,2,1,1}, 3), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(numberOfSubarrays(new int[]{2,4,6}, 1), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2}, 2), 16);
    }
}