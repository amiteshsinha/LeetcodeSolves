package com.leetcode.findScoreOfArrayAfterMarking;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * FindScoreOfArrayAfterMarkingElements
 * <p>
 * This file was created on 13/12/24 / Friday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract long findScore(int[] nums);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(findScore(new int[]{2,1,3,4,5,2}), 7);
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(findScore(new int[]{2,3,5,1,3,2}), 5);
    }

    @Test
    public void should_give_correct_output_3() {
    }
}
