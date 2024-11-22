package com.leetcode.flipColForMaxEqualRows;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * FlipColForMaxNoOfEqualRows
 * <p>
 * This file was created on 22/11/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxEqualRowsAfterFlips(int[][] matrix);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxEqualRowsAfterFlips(new int[][]{{0,1},{1,1}}), 1);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxEqualRowsAfterFlips(new int[][]{{0,1},{1,0}}), 2);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxEqualRowsAfterFlips(new int[][]{{0,0,0},{0,0,1},{1,1,0}}), 2);
    }
}
