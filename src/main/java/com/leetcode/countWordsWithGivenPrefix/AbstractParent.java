package com.leetcode.countWordsWithGivenPrefix;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * CountWordsWithGivenPrefix
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int prefixCount(String[] words, String pref);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(prefixCount( new String[]{"pay","attention","practice","attend"}, "at"), 2);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(prefixCount( new String[]{"leetcode","win","loops","success"}, "code"), 0);

    }

    @Test
    public void should_give_correct_output_3() {
    }
}
