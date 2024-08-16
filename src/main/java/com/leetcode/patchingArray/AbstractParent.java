package com.leetcode.patchingArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * PatchingArray
 * 16/06/24
 * Sunday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int minPatches(int[] nums, int n);

    @Test
    public void should_give_correct_output1() {
        assertEquals(minPatches(new int[]{1,3}, 6), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(minPatches(new int[]{1,5,10}, 20), 2);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(minPatches(new int[]{1,2,2}, 5), 0);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(minPatches(new int[]{1,1,1,1}, 7), 1);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(minPatches(new int[]{1,1,1,2,6}, 17), 1);
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(minPatches(new int[]{1,1,1,2,2,2,2}, 25), 2);
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(minPatches(new int[]{2,5,7}, 25), 3);
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(minPatches(new int[]{1,4,9}, 25), 3);
    }
}