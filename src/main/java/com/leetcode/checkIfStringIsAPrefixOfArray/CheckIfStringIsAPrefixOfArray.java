package com.leetcode.checkIfStringIsAPrefixOfArray;

/**
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 *
 * Memory
 * 42.39
 * MB
 * Beats
 * 74.03%
 * This file was created on 02/12/24 / Monday
 *
 * @author Amitesh Sinha
 */
public class CheckIfStringIsAPrefixOfArray extends AbstractParent {

    @Override
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
            if (!s.startsWith(stringBuilder.toString())) {
                return false;
            }
            if (s.length() == stringBuilder.length()) {
                return true;
            }
        }
        return false;
    }

}
