package com.leetcode.integerPalindrome;

import org.junit.jupiter.api.Test;

public class palindromeInteger {

    public boolean isPalindrome(int x) {
        if (0 > x) {
            return false;
        }
        int i = x, divisor = 10, k = 0;
        while (i > 0) {
            k = k*10 + i%divisor;
            i = i/divisor;
        }
        return (k == x);
    }

    //better solution - if we only revert half of the \text{int}int number?
    // After all, the reverse of the last half of the palindrome should be the same as the first half of the number,
    // if the number is a palindrome.
    //Since we divided the number by 10, and multiplied the reversed number by 10,
    // when the original number is less than the reversed number, it means we've processed half of the number digits.

    public boolean isPalindrome2(int x) {
        if (x < 0 || x%10 == 0 & x != 0) {
            return false;
        } else {
            int revertedNo = 0;
            while (x > revertedNo) {
                revertedNo = revertedNo*10 + x%10;
                x /= 10;
            }
            return ( revertedNo == x || x == revertedNo/10);
        }
    }

    @Test
    public void should_return_true_for_palindrome1() {
        assert (isPalindrome2(22));
    }

    @Test
    public void should_return_true_for_palindrome2() {
        assert (isPalindrome2(1221));
    }

    @Test
    public void should_return_true_for_palindrome3() {
        assert (isPalindrome2(12321));
    }
}
