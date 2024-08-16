package com.leetcode.longestcontgSubArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * LongestContiguousSubArray
 * 23/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int longestSubarray(int[] nums, int limit);

    @Test
    public void should_give_correct_output1() {
        assertEquals(longestSubarray(new int[]{8,2,4,7}, 4), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(longestSubarray(new int[]{10,1,2,4,7,2}, 5), 4);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(longestSubarray(new int[]{4,2,2,2,4,4,2,2}, 0), 3);
    }
}