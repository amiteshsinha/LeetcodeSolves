package com.leetcode.islandPerimeter;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * IslandPerimeter
 * 26/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int islandPerimeter(int[][] grid);

    @Test
    public void should_give_correct_output1() {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        Assert.assertEquals(islandPerimeter(grid), 16);
    }

    @Test
    public void should_give_correct_output2() {
        int[][] grid = {{1}};
        Assert.assertEquals(islandPerimeter(grid), 4);

    }

    @Test
    public void should_give_correct_output3() {
        int[][] grid = {{1,0}};
        Assert.assertEquals(islandPerimeter(grid), 4);
    }
}