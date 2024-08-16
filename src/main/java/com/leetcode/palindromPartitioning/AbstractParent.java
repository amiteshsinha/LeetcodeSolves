package com.leetcode.palindromPartitioning;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * PalindromePartitioning
 * 22/05/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<List<String>> partition(String s);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(partition("aab").containsAll(asList(asList("a","a","b"), asList("aa", "b"))));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(partition("b").containsAll(asList(asList("b"))));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertTrue(partition("aabb").containsAll(asList(asList("a","a","b","b"), asList("aa", "bb"))));
    }
}