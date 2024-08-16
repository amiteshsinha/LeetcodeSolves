package com.leetcode.spiral.matrix;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * SpiralMatrix
 * 07/06/23
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> spiralOrder(int[][] matrix);

    @Test
    public void should_give_correct_output1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,6,9,8,7,4,5)));
    }

    @Test
    public void should_give_correct_output2() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7)));
    }

    @Test
    public void should_give_correct_output3() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12)));
    }

    @Test
    public void should_give_correct_output4() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,4,5,10,15,20,25,24,23,22,21,16,11,6,7,8,9,14,19,18,17,12,13)));
    }

    @Test
    public void should_give_correct_output5() {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,4,5,10,15,14,13,12,11,6,7,8,9)));
    }

    @Test
    public void should_give_correct_output6() {
        int[][] matrix = {{1,2},{3,4},{5,6}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,4,6,5,3)));
    }

    @Test
    public void should_give_correct_output7() {
        int[][] matrix = {{1,2},{3,4}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,4,3)));
    }

    @Test
    public void should_give_correct_output8() {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10)));
    }

    @Test
    public void should_give_correct_output9() {
        int[][] matrix = {{1,2,3}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3)));
    }

    @Test
    public void should_give_correct_output10() {
        int[][] matrix = {{1}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1)));
    }

    @Test
    public void should_give_correct_output11() {
        int[][] matrix = {{1,2,3},{4,5,6}};
        List<Integer> retList = spiralOrder(matrix);
        Assert.assertEquals(retList, new LinkedList<>(Arrays.asList(1,2,3,6,5,4)));
    }
}