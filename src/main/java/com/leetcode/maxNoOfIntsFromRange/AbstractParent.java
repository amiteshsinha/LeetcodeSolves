package com.leetcode.maxNoOfIntsFromRange;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MaxNoOfIntegersFromRange
 * <p>
 * This file was created on 06/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxCount(int[] banned, int n, int maxSum);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxCount(new int[]{1,6,5}, 5, 6), 2);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxCount(new int[]{1,2,3,4,5,6,7}, 8, 1), 0);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxCount(new int[]{11}, 7, 50), 7);
    }
}
