package com.leetcode.countSquareSubmatriceWithAllOnes;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * CountSquareSubmatricesWithAllOnes
 * <p>
 * This file was created on 27/10/24 / Sunday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int countSquares(int[][] matrix);

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    @Test
    public void should_give_correct_output_1() {
        assertEquals(countSquares(new int[][]{
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}}), 15);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(countSquares(new int[][]{
                {1, 0, 1},
                {1, 1, 0},
                {1, 1, 0}}), 7);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(countSquares(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 1, 0},
                {1, 1, 1},
                {1, 1, 0}}), 8);
    }
}
