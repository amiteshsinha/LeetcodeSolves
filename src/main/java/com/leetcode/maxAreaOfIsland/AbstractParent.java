package com.leetcode.maxAreaOfIsland;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * MaxAreaOfIsland
 * 27/04/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int maxAreaOfIsland(int[][] grid);

    @Test
    public void should_give_correct_output1() {
        int[][] grid = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        Assert.assertEquals(maxAreaOfIsland(grid), 6);
    }

    @Test
    public void should_give_correct_output2() {
        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};
        Assert.assertEquals(maxAreaOfIsland(grid), 0);
    }

    @Test
    public void should_give_correct_output3() {
        int[][] grid = {
                {1, 1, 1, 1, 0},
                {1, 1, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        Assert.assertEquals(maxAreaOfIsland(grid), 9);
    }

    @Test
    public void should_give_correct_output4() {
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}};
        Assert.assertEquals(maxAreaOfIsland(grid), 4);
    }

    @Test
    public void should_give_correct_output5() {
        int[][] grid = {
                {1, 1, 1, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {1, 1, 0, 1, 1}};
        Assert.assertEquals(maxAreaOfIsland(grid), 5);
    }
}