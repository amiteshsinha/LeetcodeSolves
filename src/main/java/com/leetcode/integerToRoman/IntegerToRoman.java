package com.leetcode.integerToRoman;

import org.junit.jupiter.api.Test;

import java.util.Map;

public class IntegerToRoman {

    public static Map<Integer, String> aRomanValToCharMap;

    public String intToRoman(int num) {
        int[] refIntArr =        {1,   4,    5,   9,    10,  40,   50,  90,   100, 400,  500, 900,  1000};
        String[] refStringArr = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder ret = new StringBuilder();
        int i = 12;
        while (num > 0) {
            while (i >= 0) {
                if (num >= refIntArr[i]) {
                    ret.append(refStringArr[i]);
                    num = num - refIntArr[i];
                } else {
                    i--;
                }
            }
        }
        return ret.toString();
    }

    @Test
    public void should_convert_valid_roman_to_number1() {
        assert (intToRoman(3).equals("III"));
    }

    @Test
    public void should_convert_valid_roman_to_number2() {
        assert (intToRoman(58).equals("LVIII"));
    }

    @Test
    public void should_convert_valid_roman_to_number3() {
        assert (intToRoman(4).equals("IV"));
    }

    @Test
    public void should_convert_valid_roman_to_number4() {
        assert (intToRoman(9).equals("IX"));
    }

    @Test
    public void should_convert_valid_roman_to_number5() {
        assert (intToRoman(1994).equals("MCMXCIV"));
    }
}
