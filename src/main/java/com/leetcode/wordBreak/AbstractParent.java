package com.leetcode.wordBreak;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * WordBreakFail
 * 25/05/24
 * Saturday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract boolean wordBreak(String s, List<String> wordDict);

    @Test
    public void should_give_correct_output1() {
        Assert.assertTrue(wordBreak("leetcode", new ArrayList<>(Arrays.asList("leet","code"))));
    }

    @Test
    public void should_give_correct_output2() {
        Assert.assertTrue(wordBreak("applepenapple", new ArrayList<>(Arrays.asList("apple","pen"))));
    }

    @Test
    public void should_give_correct_output3() {
        Assert.assertFalse(wordBreak("catsandog", new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"))));
    }

    @Test
    public void should_give_correct_output4() {
        Assert.assertFalse(wordBreak("a", new ArrayList<>(Arrays.asList("b"))));
    }

    @Test
    public void should_give_correct_output5() {
        Assert.assertTrue(wordBreak("abcd", new ArrayList<>(Arrays.asList("a","abc","b","cd"))));
    }

    @Test
    public void should_give_correct_output8() {
        Assert.assertTrue(wordBreak("cars", new ArrayList<>(Arrays.asList("car","ca","rs"))));
    }

    @Test
    public void should_give_correct_output9() {
        Assert.assertFalse(wordBreak("cbca", new ArrayList<>(Arrays.asList("bc","ca"))));
    }

    @Test
    public void should_give_correct_output10() {
            Assert.assertTrue(wordBreak("ccaccc", new ArrayList<>(Arrays.asList("cc","ac"))));
    }

    @Test
    public void should_give_correct_output11() {
        Assert.assertTrue(wordBreak("dogs", new ArrayList<>(Arrays.asList("dog","s","gs"))));
    }

    @Test
    public void should_give_correct_output12() {
        Assert.assertTrue(wordBreak("ddadddbdddadd", new ArrayList<>(Arrays.asList("dd","ad","da","b"))));
    }

    @Test
    public void should_give_correct_output_91() {
        Assert.assertFalse(wordBreak(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",
                new ArrayList<>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"))));
    }

    /**
     * startsWith is the fix
     * there is baab substring which cannot be formed by any word
     */
    @Test
    public void should_give_correct_output_92() {
        Assert.assertFalse(wordBreak(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                new ArrayList<>(Arrays.asList("aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa","ba"))));
    }

}