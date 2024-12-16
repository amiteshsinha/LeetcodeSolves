package com.leetcode.finalArrayStateAfterKMultiplications;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * FinalArrayKAfterKMultiplications
 * <p>
 * This file was created on 16/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int[] getFinalState(int[] nums, int k, int multiplier);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(getFinalState(new int[]{2,1,3,5,6}, 5, 2), new int[]{8,4,6,5,6});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(getFinalState(new int[]{1,2}, 3, 4), new int[]{16,8});
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
