package com.leetcode.reversePrefixOfWord;

public class ReversePrefixOfWord extends AbstractParent {

    @Override
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        return new StringBuilder(word.substring(0, index + 1)).reverse().append(word.substring(index + 1)).toString();
    }
}
