package com.leetcode.minTimeDifference;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * MinTimeDifference
 * 16/09/24
 * Monday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int findMinDifference(List<String> timePoints);

    @Test
    public void should_give_correct_output1() {
        assertEquals(findMinDifference(asList("23:59","00:00")), 1);
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(findMinDifference(asList("00:00","23:59","00:00")), 0);
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(findMinDifference(asList("00:00","22:59","01:00")), 60);
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(findMinDifference(asList("01:00","03:00","23:59","22:00")), 61);
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(findMinDifference(asList("00:00","23:01","01:00")), 59);
    }
}