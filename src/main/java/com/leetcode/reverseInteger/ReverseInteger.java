package com.leetcode.reverseInteger;

import org.junit.jupiter.api.Test;

public class ReverseInteger {

    public int reverse(int x) {
        long out = 0l;
        while (x != 0) {
            out = out*10 + x%10;
            x = x/10;
        }
        if (out > Integer.MAX_VALUE || out <= Integer.MIN_VALUE) {
            return 0;
        }
        return (int)out;
    }

    @Test
    public void should_return_reverseint1() {
        assert (reverse(123) == 321);
    }

    @Test
    public void should_return_reverseint2() {
        assert (reverse(-123) == -321);
    }

    @Test
    public void should_return_reverseint3() {
        assert (reverse(100) == 1);
    }

    @Test
    public void should_return_reverseint4() {
        assert (reverse(-2147483648) == 0);
    }
}
