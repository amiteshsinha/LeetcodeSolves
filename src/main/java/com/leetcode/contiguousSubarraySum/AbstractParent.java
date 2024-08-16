package com.leetcode.contiguousSubarraySum;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;


/**
 * ContiguousSubarraySum
 * 08/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean checkSubarraySum(int[] nums, int k);

    @Test
    public void should_give_correct_output1() {
        assertTrue(checkSubarraySum(new int[]{23,2,4,6,7}, 6));
    }

    @Test
    public void should_give_correct_output2() {
        assertTrue(checkSubarraySum(new int[]{23,2,6,4,7}, 6));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertFalse(checkSubarraySum(new int[]{23,2,6,4,7}, 13));
    }
}