package com.leetcode.insertInterval;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * InsertInterval
 * 30/04/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[][] insert(int[][] intervals, int[] newInterval);

    @Test
    public void should_give_correct_output1() {
       int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{1,5},{6,9}});
    }

    @Test
    public void should_give_correct_output2() {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{1,2},{3,10},{12,16}});
    }

    @Test
    public void should_give_correct_output3() {
        int[][] intervals = {{}};
        int[] newInterval = {2,5};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{2,5}});
    }

    @Test
    public void should_give_correct_output4() {
        int[][] intervals = {{1,5}};
        int[] newInterval = {6,8};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{1,5},{6,8}});
    }

    @Test
    public void should_give_correct_output5() {
        int[][] intervals = {{9,11}};
        int[] newInterval = {6,8};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{6,8},{9,11}});
    }

    @Test
    public void should_give_correct_output6() {
        int[][] intervals = {{8,11}};
        int[] newInterval = {6,8};
        Assert.assertEquals(insert(intervals, newInterval), new int[][]{{6,11}});
    }
}