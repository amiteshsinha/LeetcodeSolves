package com.leetcode.noOfMatchingSubsequences;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * NoOfMatchingSubsequences
 * <p>
 * This file was created on 11/12/24 / Wednesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int numMatchingSubseq(String s, String[] words);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(numMatchingSubseq("abcde", new String[]{"a","bb","acd","ace"}),3);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(numMatchingSubseq("dsahjpjauf", new String[]{"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"}),2);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(numMatchingSubseq("ttttttttttttttttttttttttttkkk", new String[]{"tk","tk","tk","tl","tl","tl","tl","tl","tlt","tlt","tlt"}),3);
    }
}
