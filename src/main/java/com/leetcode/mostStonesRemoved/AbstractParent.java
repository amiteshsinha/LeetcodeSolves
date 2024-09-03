package com.leetcode.mostStonesRemoved;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * MostStonesRemovedWithSameRowCol
 * 29/08/24
 * Thursday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int removeStones(int[][] stones);

    @Test
    public void should_give_correct_output1() {
        assertEquals(removeStones(new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}), 5);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(removeStones(new int[][]{{0,0},{0,2},{1,1},{2,0},{2,2}}), 3);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(removeStones(new int[][]{{0,0}}), 0);
    }
}