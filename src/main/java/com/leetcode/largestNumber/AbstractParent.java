package com.leetcode.largestNumber;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

/**
 * LargestNumber
 * 18/09/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String largestNumber(int[] nums);

    @Test
    public void should_give_correct_output1() {
        assertEquals(largestNumber(new int[]{10,2}), "210");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(largestNumber(new int[]{3,30,34,5,9}), "9534330");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(largestNumber(new int[]{94,9494}), "949494");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(largestNumber(new int[]{94,94943}), "9494943");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(largestNumber(new int[]{24, 2431}), "243124");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(largestNumber(new int[]{947, 94, 8}), "949478");
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(largestNumber(new int[]{0, 0}), "0");
    }
}