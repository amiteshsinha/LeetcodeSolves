package com.leetcode.reverseParantheses;

public class ReverseParenthesisIter1 extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 41.34
     * MB
     * Beats
     * 83.53%
     * @param s
     * @return
     */
    // only need to reverse what is in the parenthesis - rest of it needs to be as is
    int i = 0;
    @Override
    public String reverseParentheses(String s) {
        return getReversedString(s.toCharArray());
    }

    /**
     * At the start - the start maps to the starting bracket and the end maps to end of string
     * We need to first find out till when we have the matching bracket
     *
     * @param s
     * @return
     */
    private String getReversedString(char[] s) {
        StringBuilder stringBuilder = new StringBuilder();
        while (i < s.length) {
            if (s[i] == ')') {
                i++;
                return stringBuilder.reverse().toString();
            } else if (s[i] == '(') {
                i++;
                String temp = getReversedString(s);
                stringBuilder.append(temp);
            } else {
                stringBuilder.append(s[i]);
                i++;
            }
        }
        return stringBuilder.toString();
    }
}
