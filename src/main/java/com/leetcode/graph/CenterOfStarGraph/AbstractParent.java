package com.leetcode.graph.CenterOfStarGraph;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * CenterOfStarGraph
 * 27/06/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findCenter(int[][] edges);

    @Test
    public void should_give_correct_output1() {
        Assert.assertEquals(findCenter(new int[][]{{1,2},{2,3},{4,2}}), 2);
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertEquals(findCenter(new int[][]{{1,2},{5,1},{1,3},{1,4}}), 1);
    }

    @Test
    public void should_give_correct_output3() {
    }
}