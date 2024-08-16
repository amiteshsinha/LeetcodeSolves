package com.leetcode.graph.AllAncestors;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;

/**
 * AllAncestorsOfDAG
 * 29/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<List<Integer>> getAncestors(int n, int[][] edges);

    @Test
    public void should_give_correct_output1() {
        assertEquals(getAncestors(8, new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}}),
                asList(asList(), asList(), asList(), asList(0, 1), asList(0, 2), asList(0, 1, 3), asList(0, 1, 2, 3, 4), asList(0, 1, 2, 3)));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(getAncestors(5, new int[][]{{0,1},{0,2},{0,3},{0,4},{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}}),
                asList(asList(), asList(0), asList(0, 1), asList(0, 1, 2), asList(0, 1, 2, 3)));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(getAncestors(6, new int[][]{{0,3},{5,0},{2,3},{4,3},{5,3},{1,3},{2,5},{0,1},{4,5},{4,2},{4,0},{2,1},{5,1}}),
                asList(asList(2,4,5), asList(0,2,4,5), asList(4), asList(0, 1, 2,4,5), asList(), asList(2,4)));
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(getAncestors(9, new int[][]{{3,6},{2,4},{8,6},{7,4},{1,4},{2,1},{7,2},{0,4},{5,0},{4,6},{3,2},{5,6},{1,6}}),
                asList(asList(5),asList(2,3,7),asList(3,7),asList(),asList(0,1,2,3,5,7),asList(),asList(0,1,2,3,4,5,7,8),asList(),asList()));
    }
}