package com.leetcode.IntegerToEnglishWords;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

/**
 * IntegerToEnglishWords
 * 07/08/24
 * Wednesday
 *
 * @author Amitesh Sinha
 **/

public abstract class AbstractParent {

    public abstract String numberToWords(int num);

    @Test
    public void should_give_correct_output1() {
        assertEquals(numberToWords(123), "One Hundred Twenty Three");
    }

    @Test
    public void should_give_correct_output2() {
        assertEquals(numberToWords(12345), "Twelve Thousand Three Hundred Forty Five");
    }

    @Test
    public void should_give_correct_output3() {
        assertEquals(numberToWords(1234567), "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven");
    }

    @Test
    public void should_give_correct_output4() {
        assertEquals(numberToWords(0), "Zero");
    }

    @Test
    public void should_give_correct_output5() {
        assertEquals(numberToWords(100), "One Hundred");
    }

    @Test
    public void should_give_correct_output6() {
        assertEquals(numberToWords(57), "Fifty Seven");
    }

    @Test
    public void should_give_correct_output7() {
        assertEquals(numberToWords(99), "Ninety Nine");
    }

    @Test
    public void should_give_correct_output8() {
        assertEquals(numberToWords(1299), "One Thousand Two Hundred Ninety Nine");
    }

    @Test
    public void should_give_correct_output9() {
        assertEquals(numberToWords(7000), "Seven Thousand");
    }

    @Test
    public void should_give_correct_output10() {
        assertEquals(numberToWords(1123456789), "One Trillion One Hundred Twenty Three Million Four Hundred Fifty Six Thousand "
                + "Seven Hundred Eighty Nine");
    }
}