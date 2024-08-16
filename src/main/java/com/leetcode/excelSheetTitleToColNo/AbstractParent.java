package com.leetcode.excelSheetTitleToColNo;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * ExcelSheetTitleToColNo
 * 02/07/24
 * Tuesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract int titleToNumber(String columnTitle);

    @Test
    public void should_give_correct_output1() {
        assertEquals(2, titleToNumber("B"));
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(27, titleToNumber("AA"));
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(701, titleToNumber("ZY"));
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(52, titleToNumber("AZ"));
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(53, titleToNumber("BA"));
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(26, titleToNumber("Z"));
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(78, titleToNumber("BZ"));
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(702, titleToNumber("ZZ"));
    }
}