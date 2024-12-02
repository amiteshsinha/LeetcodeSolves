package com.leetcode.shortestDistanceAfterRoadAddnQueries1;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * ShortestDistAfterRoadAddnQueries1
 * <p>
 * This file was created on 27/11/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int[] shortestDistanceAfterQueries(int n, int[][] queries);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(shortestDistanceAfterQueries(5, new int[][]{{2,4},{0,2},{0,4}}), new int[]{3,2,1});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(shortestDistanceAfterQueries(4, new int[][]{{0,3},{0,2}}), new int[]{1,1});
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
