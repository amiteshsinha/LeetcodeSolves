package com.leetcode.numberOfIslands;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

/**
 * NumberOfIslandsDFS
 * 26/04/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numIslands(char[][] grid);

    @Test
    public void should_give_correct_output1() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        Assert.assertEquals(numIslands(grid), 1);
    }

    @Test
    public void should_give_correct_output2() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        Assert.assertEquals(numIslands(grid), 3);
    }

    @Test
    public void should_give_correct_output3() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '0', '0'},
                {'1', '1', '0', '1', '1'}};
        Assert.assertEquals(numIslands(grid), 5);
    }
}