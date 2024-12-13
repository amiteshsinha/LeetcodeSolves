package com.leetcode.twoBestNonOverlappingEvents;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * TwoBestNonOverlappingEvents
 * <p>
 * This file was created on 09/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxTwoEvents(int[][] events);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxTwoEvents(new int[][]{{1,3,2},{4,5,2},{2,4,3}}), 4);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxTwoEvents(new int[][]{{1,3,2},{4,5,2},{1,5,5}}), 5);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxTwoEvents(new int[][]{{1,5,3},{1,5,1},{6,6,5}}), 8);
    }
}
