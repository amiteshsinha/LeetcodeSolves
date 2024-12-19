package com.leetcode.maxChunkToMakeSorted;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * MaxChunkToMakeSorted
 * <p>
 * This file was created on 19/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int maxChunksToSorted(int[] arr);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(maxChunksToSorted(new int[]{4,3,2,1,0}), 1); // 1 in correct pos(2)
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(maxChunksToSorted(new int[]{1,0,2,3,4}), 4);// 3 in correct pos
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(maxChunksToSorted(new int[]{1,4,0,3,2}), 1);// 1 in correct pos
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(maxChunksToSorted(new int[]{1,3,0,2,4}), 2);//[1,3,0,2][4] // 1 in correct pos
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(maxChunksToSorted(new int[]{1,0,2,4,3}), 3); // [0,1], [2], [3,4] //1 in correct pos
    }

    @Test
    public void should_give_correct_output_6() {
        assertEquals(maxChunksToSorted(new int[]{0,1,3,2,5,4}), 4); // [0],[1],[2,3],[4,5] //2 in correct pos
    }
}
