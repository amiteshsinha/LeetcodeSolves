package com.leetcode.graph.maxTotalImportanceOfRoads;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MaxImportanceOfRoads
 * 28/06/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract long maximumImportance(int n, int[][] roads);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maximumImportance(5, new int[][] {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}}), 43);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maximumImportance(5, new int[][] {{0,3},{2,4},{1,3}}), 20);
    }

    @Test
    public void should_give_correct_output3() {
    }
}