package com.leetcode.slidingPuzzle;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SlidingPuzzle
 * <p>
 * This file was created on 25/11/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int slidingPuzzle(int[][] board);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(slidingPuzzle(new int[][]{
                {1,2,3},
                {4,0,5}}), 1);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(slidingPuzzle(new int[][]{
                {1,2,3},
                {5,4,0}}), -1);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(slidingPuzzle(new int[][]{
                {4,1,2},
                {5,0,3}}), 5);
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(slidingPuzzle(new int[][]{
                {1,5,2},
                {4,0,3}}), 3);
    }

    @Test
    public void should_give_correct_output_5() {
        assertEquals(slidingPuzzle(new int[][]{
                {4,1,0},
                {5,3,2}}), 5);
    }
}
