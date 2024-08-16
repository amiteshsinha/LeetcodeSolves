package com.leetcode.sortColors;

import org.junit.jupiter.api.Test;

import static java.util.stream.IntStream.of;
import static org.testng.Assert.assertEquals;

/**
 * SortColors
 * 12/06/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract void sortColors(int[] nums);

    @Test
    public void should_give_correct_output1() {

        int[] nums = {2,0,2,1,1,0};
        of();
        sortColors(nums);
        assertEquals(nums, new int[]{0,0,1,1,2,2});
    }

    @Test
    public void should_give_correct_output2() {
        int[] nums = {2,0,1};
        sortColors(nums);
        assertEquals(nums, new int[]{0,1,2});
    }

    @Test
    public void should_give_correct_output3() {
        int[] nums = {0,2,0,1,1,1};
        sortColors(nums);
        assertEquals(nums, new int[]{0,0,1,1,1,2});
    }

    @Test
    public void should_give_correct_output4() {
        int[] nums = {0,0};
        sortColors(nums);
        assertEquals(nums, new int[]{0,0});
    }

    @Test
    public void should_give_correct_output5() {
        int[] nums = {1,1};
        sortColors(nums);
        assertEquals(nums, new int[]{1,1});
    }

    @Test
    public void should_give_correct_output6() {
        int[] nums = {2,2};
        sortColors(nums);
        assertEquals(nums, new int[]{2,2});
    }

    @Test
    public void should_give_correct_output7() {
        int[] nums = {0,2};
        sortColors(nums);
        assertEquals(nums, new int[]{0,2});
    }

    @Test
    public void should_give_correct_output8() {
        int[] nums = {0,0,2};
        sortColors(nums);
        assertEquals(nums, new int[]{0,0,2});
    }

    @Test
    public void should_give_correct_output9() {
        int[] nums = {1,2,1};
        sortColors(nums);
        assertEquals(nums, new int[]{1,1,2});
    }
}