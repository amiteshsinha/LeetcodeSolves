package com.leetcode.subsetXORSum;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SubsetXorSum
 * 20/05/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int subsetXORSum(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(subsetXORSum(new int[]{1,3}), 6);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(subsetXORSum(new int[]{5,1,6}), 28);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(subsetXORSum(new int[]{3,4,5,6,7,8}), 480);
    }
}