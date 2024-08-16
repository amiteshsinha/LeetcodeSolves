package com.leetcode.pascal.triangle;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * PascalTriangle
 * 12/03/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<List<Integer>> generate(int numRows);

    @Test
    public void should_give_correct_output1() {
        List<List<Integer>> retList = generate(1);
        List<List<Integer>> expectedList = new ArrayList(asList(1));
        Assert.assertEquals(retList, expectedList);
    }

    @Test
    //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    public void should_give_correct_output2() {
        List<List<Integer>> retList = generate(5);
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(asList(1));
        expectedList.add(asList(1,1));
        expectedList.add(asList(1,2,1));
        expectedList.add(asList(1,3,3,1));
        expectedList.add(asList(1,4,6,4,1));
        Assert.assertEquals(retList, expectedList);
    }

    @Test
    public void should_give_correct_output3() {
    }
}