package com.leetcode.graph.removeMaxEdgesWithTraversal;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * RemoveMaxNoEdgesWithTraversal
 * 30/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxNumEdgesToRemove(int n, int[][] edges);

    @Test
    public void should_give_correct_output1() {
        assertEquals(maxNumEdgesToRemove(4, new int[][]{{3,1,2},{3,2,3},{1,1,3},{1,2,4},{1,1,2},{2,3,4}}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(maxNumEdgesToRemove(4, new int[][]{{3,1,2},{3,2,3},{1,1,4},{2,1,4}}), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(maxNumEdgesToRemove(4, new int[][]{{3,2,3},{1,1,2},{2,3,4}}), -1);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(maxNumEdgesToRemove(4, new int[][]{{3,1,2},{3,3,4},{1,1,3},{2,2,4}}), 0);
    }
}