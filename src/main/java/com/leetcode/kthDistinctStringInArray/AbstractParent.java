package com.leetcode.kthDistinctStringInArray;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * KthDistinctStringInArray
 * 05/08/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String kthDistinct(String[] arr, int k);

    @Test
    public void should_give_correct_output1() {
        assertEquals(kthDistinct(new String[]{"d","b","c","b","c","a"}, 2), "a");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(kthDistinct(new String[]{"aaa","aa","a"}, 1), "aaa");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(kthDistinct(new String[]{"a","b","a"}, 3), "");
    }
}