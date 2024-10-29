package com.leetcode.maxNoOfMovesInGrid;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MaxNoOfMovesInGrid
 * <p>
 * This file was created on 29/10/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxMoves(int[][] grid);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxMoves(new int[][]{{2,4,3,5},{5,4,9,3},{3,4,2,11},{10,9,13,15}}), 3);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxMoves(new int[][]{{3,2,4},{2,1,9},{1,1,7}}), 0);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxMoves(new int[][]{{3,2,4},{2,4,9},{1,1,7}}), 2);
    }
}
