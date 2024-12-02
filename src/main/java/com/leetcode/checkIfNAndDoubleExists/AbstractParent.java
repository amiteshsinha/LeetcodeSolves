package com.leetcode.checkIfNAndDoubleExists;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * checkIfNAndItsDoubleExists
 * <p>
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract boolean checkIfExist(int[] arr);

    @Test
    public void should_give_correct_output_1() {
        assertTrue(checkIfExist(new int[]{10,2,5,3}));
    }

    @Test
    public void should_give_correct_output_2() {
        assertFalse(checkIfExist(new int[]{3,1,7,11}));
    }

    @Test
    public void should_give_correct_output_3() {
        assertFalse(checkIfExist(new int[]{3,0,7,11}));
    }

    @Test
    public void should_give_correct_output_4() {
        assertTrue(checkIfExist(new int[]{3,0,7,0}));
    }

    @Test
    public void should_give_correct_output_5() {
        assertTrue(checkIfExist(new int[]{2,0,7,4}));
    }

    @Test
    public void should_give_correct_output_6() {
        assertFalse(checkIfExist(new int[]{2,3,7,5}));
    }
}
