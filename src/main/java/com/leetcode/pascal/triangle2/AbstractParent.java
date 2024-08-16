package com.leetcode.pascal.triangle2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

/**
 * PascalTriangle2Recursive
 * 05/03/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<Integer> getRow(int rowIndex);

    @Test
    public void should_give_correct_output1() {
        List<Integer> retList = getRow(1);
        Assert.assertEquals(retList, Arrays.asList(1,1));
    }

    @Test
    public void should_give_correct_output2() {
        List<Integer> retList = getRow(2);
        Assert.assertEquals(retList, Arrays.asList(1,2,1));
    }

    @Test
    public void should_give_correct_output3() {
        List<Integer> retList = getRow(3);
        Assert.assertEquals(retList, Arrays.asList(1,3,3,1));
    }

    @Test
    public void should_give_correct_output4() {
        List<Integer> retList = getRow(4);
        Assert.assertEquals(retList, Arrays.asList(1,4,6,4,1));
    }

    @Test
    public void should_give_correct_op8() {
        List<Integer> retList = getRow(8);
        Assert.assertEquals(retList, Arrays.asList(1,8,28,56,70,56,28,8,1));
    }

    @Test
    public void should_give_correct_output30() {
        List<Integer> retList = getRow(30);
        Assert.assertEquals(retList, Arrays.asList(1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1));
    }
}