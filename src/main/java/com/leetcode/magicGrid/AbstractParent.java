package com.leetcode.magicGrid;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * MagicSquareInGrid
 * 09/08/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int numMagicSquaresInside(int[][] grid);

    @Test
    public void should_give_correct_output1() {
        assertEquals(numMagicSquaresInside(new int[][]{{4,3,8,4},{9,5,1,9},{2,7,6,2}}), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(numMagicSquaresInside(new int[][]{{8}}), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(numMagicSquaresInside(new int[][]{{2,7,6},{1,5,9},{4,3,8}}), 0);
    }
}