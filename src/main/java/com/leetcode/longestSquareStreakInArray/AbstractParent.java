package com.leetcode.longestSquareStreakInArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * LongestSquareStreakInArray
 * <p>
 * This file was created on 28/10/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int longestSquareStreak(int[] nums);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(longestSquareStreak(new int[]{4,3,6,16,8,2}), 3);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(longestSquareStreak(new int[]{2,3,5,6,7}), -1);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(longestSquareStreak(new int[]{4,3,6,16,8,2,9,81,6561}), 4);
    }
}
