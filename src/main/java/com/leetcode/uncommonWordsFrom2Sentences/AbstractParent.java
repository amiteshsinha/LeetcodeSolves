package com.leetcode.uncommonWordsFrom2Sentences;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * UncommonWord2Sentences
 * 17/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String[] uncommonFromSentences(String s1, String s2);

    @Test
    public void should_give_correct_output1() {
        assertEquals(uncommonFromSentences("this apple is sweet", "this apple is sour"), new String[]{"sour","sweet"});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(uncommonFromSentences("apple apple", "banana"), new String[]{"banana"});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(uncommonFromSentences("fo ly ly", "fo fo etx"), new String[]{"etx"});
    }
}