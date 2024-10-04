package com.leetcode.checkIfArrPairsDivByK;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * CheckIfArrPairsDivByK
 * This file was created on 04/10/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean canArrange(int[] arr, int k);

    @Test
    public void should_give_correct_output1() {
        assertTrue(canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(canArrange(new int[]{1,2,3,4,5,6}, 7));
    }

    @Test
    public void should_give_correct_output3() {
        assertFalse(canArrange(new int[]{1,2,3,4,5,6}, 10));
    }

    @Test
    public void should_give_correct_output4() {
        assertTrue(canArrange(new int[]{1,2,38,4,19,13}, 7));
    }

    @Test
    public void should_give_correct_output5() {
        assertTrue(canArrange(new int[]{-1,1,-2,2,-3,3,-4,4}, 3));
    }
}
