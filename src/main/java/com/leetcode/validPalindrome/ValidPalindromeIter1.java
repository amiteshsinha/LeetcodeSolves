package com.leetcode.validPalindrome;

public class ValidPalindromeIter1 extends AbstractParent {

    /**
     *Runtime
     * 14
     * ms
     * Beats
     * 34.55%
     * of users with Java
     * Memory
     * 44.44
     * MB
     * Beats
     * 42.54%
     * of users with Java
     * @param s
     * @return
     */
    @Override
    public boolean isPalindrome(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(actual).reverse().toString();
        return actual.equals(rev);
    }
}
