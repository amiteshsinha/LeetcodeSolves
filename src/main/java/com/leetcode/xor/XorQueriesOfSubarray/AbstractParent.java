package com.leetcode.xor.XorQueriesOfSubarray;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * XorQueriesOfSubarray
 * 13/09/24
 * Friday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] xorQueries(int[] arr, int[][] queries);

    @Test
    public void should_give_correct_output1() {
        assertEquals(xorQueries(new int[]{1,3,4,8}, new int[][]{{0,1},{1,2},{0,3},{3,3}}), new int[]{2,7,14,8});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(xorQueries(new int[]{4,8,2,10}, new int[][]{{2,3},{1,3},{0,0},{0,3}}), new int[]{8,0,4,4});
    }

    @Test
    public void should_give_correct_output3() {
    }
}