package com.leetcode.sortPeople;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * SortThePeopleOnHeight
 * 22/07/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String[] sortPeople(String[] names, int[] heights);

    @Test
    public void should_give_correct_output1() {
        assertEquals(sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170}), new String[]{"Mary","Emma","John"});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(sortPeople(new String[]{"Alice","Bob","Bob"}, new int[]{155,185,150}), new String[]{"Bob","Alice","Bob"});
    }

    @Test
    public void should_give_correct_output3() {
    }
}