package com.leetcode.rankTransformAnArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * RankTransformAnArray
 * This file was created on 02/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {

    public abstract int[] arrayRankTransform(int[] arr);

    @Test
    public void should_give_correct_output1() {
        assertEquals(arrayRankTransform(new int[]{40, 10, 20, 30}), new int[]{4, 1, 2, 3});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(arrayRankTransform(new int[]{100, 100, 100}), new int[]{1, 1, 1});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}), new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3});
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(arrayRankTransform(new int[]{30, 30, 31, 20, 20}), new int[]{2, 2, 3, 1, 1});
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(arrayRankTransform(new int[]{-30, 30, 31, 20, 20}), new int[]{1, 3, 4, 2, 2});
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(arrayRankTransform(new int[]{-1000000000,10,20,30,1000000000}), new int[]{1, 2, 3, 4, 5});
    }
}
