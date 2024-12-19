package com.leetcode.specialArray2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * SpecialArray2
 * <p>
 * This file was created on 18/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean[] isArraySpecial(int[] nums, int[][] queries);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(isArraySpecial(new int[]{3,4,1,2,6}, new int[][]{{0,4}}), new boolean[]{false});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(isArraySpecial(new int[]{4,3,1,6}, new int[][]{{0,2},{2,3}}), new boolean[]{false,true});
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(isArraySpecial(new int[]{1}, new int[][]{{0,0}}), new boolean[]{true});
    }
}
