package com.leetcode.subsets;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Subsets
 * 21/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<List<Integer>> subsets(int[] nums);

    @Test
    public void should_give_correct_output1() {
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList());
        expectedList.add(Arrays.asList(1));
        expectedList.add(Arrays.asList(2));
        expectedList.add(Arrays.asList(1,2));
        expectedList.add(Arrays.asList(3));
        expectedList.add(Arrays.asList(1,3));
        expectedList.add(Arrays.asList(2,3));
        expectedList.add(Arrays.asList(1,2,3));
        Assert.assertTrue(subsets(new int[]{1,2,3}).containsAll(expectedList));
    }

    @Test
    public void should_give_correct_output2() {
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList());
        expectedList.add(Arrays.asList(2));
        expectedList.add(Arrays.asList(3));
        expectedList.add(Arrays.asList(2,3));
        List<List<Integer>> actualList = subsets(new int[]{2,3});
        Assert.assertEquals(actualList.size(), expectedList.size());
        Assert.assertTrue(actualList.containsAll(expectedList));
    }

    @Test
    public void should_give_correct_output3() {
        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList());
        expectedList.add(Arrays.asList(0));
        Assert.assertTrue(subsets(new int[]{0}).containsAll(expectedList));
    }
}