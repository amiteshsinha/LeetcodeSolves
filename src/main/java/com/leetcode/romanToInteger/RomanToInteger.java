package com.leetcode.romanToInteger;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
public static Map<Character, Integer> aRomanCharToValMap;
    static {
        aRomanCharToValMap = new HashMap<>();
        aRomanCharToValMap.put('I', 1);
        aRomanCharToValMap.put('V', 5);
        aRomanCharToValMap.put('X', 10);
        aRomanCharToValMap.put('L', 50);
        aRomanCharToValMap.put('C', 100);
        aRomanCharToValMap.put('D', 500);
        aRomanCharToValMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int j = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i <= s.length() - 2) {
                j = i + 1;
                if (s.charAt(i) == 'I' && (s.charAt(j) == 'V' || s.charAt(j) == 'X')) {
                    result = result - aRomanCharToValMap.get('I') + aRomanCharToValMap.get(s.charAt(j));
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'X' && (s.charAt(j) == 'L' || s.charAt(j) == 'C')) {
                    result = result - aRomanCharToValMap.get('X') + aRomanCharToValMap.get(s.charAt(j));
                    i++;
                    continue;
                }
                if (s.charAt(i) == 'C' && (s.charAt(j) == 'D' || s.charAt(j) == 'M')) {
                    result = result - aRomanCharToValMap.get('C') + aRomanCharToValMap.get(s.charAt(j));
                    i++;
                    continue;
                }
            }
            result += aRomanCharToValMap.get(s.charAt(i));
        }
        return result;
    }

    @Test
    public void should_convert_valid_roman_to_number1() {
        assert (romanToInt("III") == 3);
    }

    @Test
    public void should_convert_valid_roman_to_number2() {
        assert (romanToInt("LVIII") == 58);
    }

    @Test
    public void should_convert_valid_roman_to_number3() {
        assert (romanToInt("IV") == 4);
    }

    @Test
    public void should_convert_valid_roman_to_number4() {
        assert (romanToInt("IX") == 9);
    }

    @Test
    public void should_convert_valid_roman_to_number5() {
        assert (romanToInt("MCMXCIV") == 1994);
    }
}
