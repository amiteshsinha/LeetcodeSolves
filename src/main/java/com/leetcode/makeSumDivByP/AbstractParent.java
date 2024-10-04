package com.leetcode.makeSumDivByP;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MakeSumDivisibleByP
 * This file was created on 03/10/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int minSubarray(int[] nums, int p);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minSubarray(new int[]{3,1,4,2}, 6), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minSubarray(new int[]{6,3,5,2}, 9), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minSubarray(new int[]{1,2,3}, 3), 0);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minSubarray(new int[]{8,32,31,18,34,20,21,13,1,27,23,22,11,15,30,4,2}, 148), 7);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minSubarray(new int[]{17,6,22,31,25,4,18,32,18,26,2,31,26,8,12,2}, 142), 7);
    }
}
