package com.leetcode.findCommonCharacters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * FindCommonCharacters
 * 05/06/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<String> commonChars(String[] words);

    @Test
    public void should_give_correct_output1() {
        assertEquals(commonChars(new String[]{"bella","label","roller"}), Arrays.asList("e","l","l"));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(commonChars(new String[]{"cool","lock","cook"}), Arrays.asList("c","o"));
    }

    @Test
    public void should_give_correct_output3() {
    }
}