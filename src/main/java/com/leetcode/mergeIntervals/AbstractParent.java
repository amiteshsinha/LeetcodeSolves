package com.leetcode.mergeIntervals;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MergeIntervals
 * 15/06/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[][] merge(int[][] intervals);

    @Test
    public void should_give_correct_output1() {
        int[][] input = {{1,3},{2,6},{8,10},{15,18}};
        int[][] output = {{1,6},{8,10},{15,18}};
        Assert.assertEquals(merge(input), output);
    }

    @Test
    public void should_give_correct_output2() {
        int[][] input = {{1,4},{4,5}};
        int[][] output = {{1,5}};
        Assert.assertEquals(merge(input), output);
    }

    @Test
    public void should_give_correct_output3() {
        int[][] input = {{2,3},{1,4}};
        int[][] output = {{1,4}};
        Assert.assertEquals(merge(input), output);
    }

    @Test
    public void should_give_correct_output4() {
        int[][] input = {{2,3},{2,2},{3,3},{1,3},{5,7},{2,2},{4,6}};
        int[][] output = {{1,3},{4,7}};
        Assert.assertEquals(merge(input), output);
    }
}