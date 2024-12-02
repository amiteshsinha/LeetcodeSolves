package com.leetcode.keepMultiplyingBy2FindValue;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * keepMultiplyingByTwoTillValueFound
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract int findFinalValue(int[] nums, int original);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(findFinalValue(new int[]{5,3,6,1,12}, 3), 24);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(findFinalValue(new int[]{2,7,9}, 4), 4);
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(findFinalValue(new int[]{161,28,640,264,81,561,320,2,61,244,183,108,773,61,976,122,988,2,370,392,488,375,349,432,713,563}, 61), 1952);
    }
}
