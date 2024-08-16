package com.leetcode.spiral.matrix2;

import org.junit.jupiter.api.Test;

/**
 * SpiralMatrix2
 * 05/09/23
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[][] generateMatrix(int n);

    @Test
    public void should_give_correct_output1() {
        int[][] matrix = generateMatrix(1);
    }

    @Test
    public void should_give_correct_output2() {
        int[][] matrix = generateMatrix(2);
    }

    @Test
    public void should_give_correct_output3() {
        int[][] matrix = generateMatrix(3);
    }

    @Test
    public void should_give_correct_output4() {
        int[][] matrix = generateMatrix(4);
    }

    @Test
    public void should_give_correct_output5() {
        int[][] matrix = generateMatrix(5);
    }

    @Test
    public void should_give_correct_output6() {
        int[][] matrix = generateMatrix(6);
    }

    @Test
    public void should_give_correct_output7() {
        int[][] matrix = generateMatrix(7);
    }
}