package com.leetcode.sumOfPrefixScoresOfStrings;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * SumOfPrefixScoreOfStrings
 * <p>
 * This file was created on 09/10/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int[] sumPrefixScores(String[] words);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(sumPrefixScores(new String[]{"abc","ab","bc","b"}), new int[]{5,4,3,2});
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(sumPrefixScores(new String[]{"abcd"}), new int[]{4});
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
