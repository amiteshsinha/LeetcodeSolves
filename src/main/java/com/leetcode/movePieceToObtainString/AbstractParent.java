package com.leetcode.movePieceToObtainString;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * MovePieceToObtainString
 * <p>
 * This file was created on 05/12/24 / Thursday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean canChange(String start, String target);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(canChange("_L__R__R_", "L______RR"));
    }

    @Test
    public void should_give_correct_output_2() {
        assertFalse(canChange("R_L_", "__LR"));
    }

    @Test
    public void should_give_correct_output_3() {
        assertFalse(canChange("_R", "R_"));
    }

    @Test
    public void should_give_correct_output_4() {
        assertFalse(canChange("_L_RL_", "L___RL"));
    }

    @Test
    public void should_give_correct_output_5() {
        assertFalse(canChange("_L__", "__L_"));
    }

    @Test
    public void should_give_correct_output_6() {
        assertTrue(canChange("___", "___"));
    }

    @Test
    public void should_give_correct_output_7() {
        assertFalse(canChange("_L", "LL"));
    }
}
