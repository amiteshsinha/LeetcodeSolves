package com.leetcode.constructStringWithRepeatLimit;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * ConstructStringWithRepeatLimit
 * <p>
 * This file was created on 17/12/24 / Tuesday
 *
 * @author Amitesh Sinha
 */
public abstract class AbstractParent {
    public abstract String repeatLimitedString(String s, int repeatLimit);

    @Test
    public void should_give_correct_output_1() {
        assertEquals(repeatLimitedString("cczazcc", 3), "zzcccac");
    }

    @Test
    public void should_give_correct_output_2() {
        assertEquals(repeatLimitedString("aababab", 2), "bbabaa");
    }

    @Test
    public void should_give_correct_output_3() {
        assertEquals(repeatLimitedString("cczazzzcyc", 3), "zzzyzcccac");
    }

    @Test
    public void should_give_correct_output_4() {
        assertEquals(repeatLimitedString("cczazzzcyyc", 3), "zzzyzycccac");
    }
}
