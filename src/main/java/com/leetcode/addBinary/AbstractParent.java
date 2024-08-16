package com.leetcode.addBinary;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * AddBinary
 * 28/05/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String addBinary(String a, String b);

    @Test
    public void should_give_correct_output1() {
        assertEquals(addBinary("11","1"), "100");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(addBinary("1010", "1011"), "10101");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(addBinary("100","1"), "101");
    }
}