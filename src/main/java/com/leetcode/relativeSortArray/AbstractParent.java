package com.leetcode.relativeSortArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * RelativeSortArray
 * 11/06/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] relativeSortArray(int[] arr1, int[] arr2);

    @Test
    public void should_give_correct_output1() {
        assertEquals(relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}),
                new int[]{2,2,2,1,4,3,3,9,6,7,19});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(relativeSortArray(new int[]{28,6,22,8,44,17}, new int[]{22,28,8,6}),
                new int[]{22,28,8,6,17,44});
    }

    @Test
    public void should_give_correct_output3() {
    }
}