package com.leetcode.prefixOfWord;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * CheckIfWordIsPrefix
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int isPrefixOfWord(String sentence, String searchWord);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(isPrefixOfWord("i love eating burger", "burg"), 4);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(isPrefixOfWord("this problem is an easy problem", "pro"), 2);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(isPrefixOfWord("i am tired", "you"), -1);
    }
}
