package com.leetcode.convert1Dto2DArray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * Convert1DTo2DArray
 * 03/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[][] construct2DArray(int[] original, int m, int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(construct2DArray(new int[]{1,2,3,4},2,2), new int[][]{{1,2},{3,4}});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(construct2DArray(new int[]{1,2,3},1,3), new int[][]{{1,2,3}});
    }

    @Test
    public void should_give_correct_output3() {
    }
}