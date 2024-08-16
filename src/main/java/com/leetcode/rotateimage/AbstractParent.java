package com.leetcode.rotateimage;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;

public abstract class AbstractParent {

    public abstract void rotate(int[][] matrix);

    void print(int[][] matrix) {
        System.out.println(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    @Test
    public void should_rotate_correct1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        int[][] result = {{7,4,1},{8,5,2},{9,6,3}};
        for (int i = 0; i < matrix.length; i++) {
            Assert.assertEquals(matrix[i], result[i]);
        }
    }

    @Test
    public void should_rotate_correct2() {
        int[][] matrix = {{1,2},{3,4}};
        rotate(matrix);
        int[][] result = {{3,1},{4,2}};
        for (int i = 0; i < matrix.length; i++) {
            Assert.assertEquals(matrix[i], result[i]);
        }
    }

    @Test
    public void should_rotate_correct3() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        int[][] result = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        for (int i = 0; i < matrix.length; i++) {
            Assert.assertEquals(matrix[i], result[i]);
        }
    }

    @Test
    public void should_rotate_correct4() {
        int[][] matrix = {{5,7,9,11,13},{2,4,6,8,10},{1,3,12,14,16},{20,22,24,26,28},{21,23,25,27,29}};
        rotate(matrix);
        int[][] result = {{21,20,1,2,5},{23,22,3,4,7},{25,24,12,6,9},{27,26,14,8,11},{29,28,16,10,13}};
        for (int i = 0; i < matrix.length; i++) {
            Assert.assertEquals(matrix[i], result[i]);
        }
    }

    @Test
    public void should_rotate_correct5() {
        int[][] matrix = {{1}};
        rotate(matrix);
        int[][] result = {{1}};
        for (int i = 0; i < matrix.length; i++) {
            Assert.assertEquals(matrix[i], result[i]);
        }
    }
}
