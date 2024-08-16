package com.leetcode.stringToInteger.atoi;

import org.junit.jupiter.api.Test;

public class StringToIntegerMyAtoi {

    public int myAtoi(String str) {
        long out = 0l; boolean isNegative = false, hasAtoiStarted = false;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-' || str.charAt(i) == '+') {
                if (!hasAtoiStarted) {
                    if (str.charAt(i) == '-') {
                        isNegative = true;
                        hasAtoiStarted = true;
                    }
                    if (str.charAt(i) == '+') {
                        isNegative = false;
                        hasAtoiStarted = true;
                    }
                    continue;
                } else {
                    return 0;
                }
            }
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                hasAtoiStarted = true;
                out = out*10 + (str.charAt(i) - 48);
                if (out > Integer.MAX_VALUE || out <= Integer.MIN_VALUE) {
                    break;
                }
            } else {
                if (hasAtoiStarted) {
                    break;
                } else {
                    return 0;
                }
            }

        }
        if (isNegative) {
            out = -1*out;
        }
        if (out > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (out <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)out;
    }

    @Test
    public void should_convert_string42_to_integer1() {
        assert (myAtoi("42") == 42);
    }

    @Test
    public void should_convert_string42_to_integer2() {
        assert (myAtoi("-42") == -42);
    }

    @Test
    public void should_convert_string_to_integer3() {
        assert (myAtoi("4193 with words") == 4193);
    }

    @Test
    public void should_not_convert_string_to_integer4() {
        assert (myAtoi("words with 4193") == 0);
    }

    @Test
    public void should_not_convert_string_to_integer5() {
        assert (myAtoi("-91283472332") == Integer.MIN_VALUE);
    }

    @Test
    public void should_not_convert_string_to_integer6() {
        assert (myAtoi("+1") == 1);
    }

    @Test
    public void should_not_convert_string_to_integer7() {
        assert (myAtoi("9223372036854775808") == Integer.MAX_VALUE);
    }

}
