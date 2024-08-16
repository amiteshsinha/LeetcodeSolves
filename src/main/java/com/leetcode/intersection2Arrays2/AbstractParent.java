package com.leetcode.intersection2Arrays2;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * IntersectionOf2Arrays
 * 02/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int[] intersect(int[] nums1, int[] nums2);

    @Test
    public void should_give_correct_output1() {
        assertEquals(intersect(new int[]{2,2}, new int[]{1,2,2,1}), new int[]{2,2});
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}), new int[]{9,4});
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(intersect(new int[]{1,2,4,5,7,9}, new int[]{2,7,11,13,15,19,1}), new int[]{2,7,1});
    }
}