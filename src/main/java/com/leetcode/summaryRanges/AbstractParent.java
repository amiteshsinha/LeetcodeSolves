package com.leetcode.summaryRanges;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * SummaryRanges
 * 17/09/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract List<String> summaryRanges(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(summaryRanges(new int[]{0,1,2,4,5,7}), asList("0->2","4->5","7"));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(summaryRanges(new int[]{0,2,3,4,6,8,9}), asList("0","2->4","6","8->9"));
    }

    @Test
    public void should_give_correct_output3() {
    }
}