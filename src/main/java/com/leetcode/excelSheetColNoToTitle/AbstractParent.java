package com.leetcode.excelSheetColNoToTitle;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ExcelSheetColTitle
 * 02/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String convertToTitle(int columnNumber);

    @Test
    public void should_give_correct_output1() {
        assertEquals(convertToTitle(2), "B");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(convertToTitle(27), "AA");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(convertToTitle(701), "ZY");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(convertToTitle(52), "AZ");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(convertToTitle(53), "BA");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(convertToTitle(26), "Z");
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(convertToTitle(78), "BZ");
    }
}