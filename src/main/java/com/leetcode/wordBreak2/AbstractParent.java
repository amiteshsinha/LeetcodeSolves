package com.leetcode.wordBreak2;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * WordBreak2
 * 25/05/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<String> wordBreak(String s, List<String> wordDict);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(wordBreak("catsanddog", new ArrayList<>(Arrays.asList("cat","cats","and","sand","dog")))
                .containsAll(Arrays.asList("cats and dog","cat sand dog")));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(wordBreak("pineapplepenapple", new ArrayList<>(Arrays.asList("apple","pen","applepen","pine","pineapple")))
                .containsAll(Arrays.asList("pine apple pen apple","pineapple pen apple","pine applepen apple")));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertTrue(wordBreak("catsandog", new ArrayList<>(Arrays.asList("cat","cats","and","sand","dog")))
                .isEmpty());
    }
}