package com.leetcode.validparantheses;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class ValidParantheses {

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == ')' || c == '}' || c == ']') {
                if (characterStack.isEmpty()) {
                    return false;
                }
                char topChar = characterStack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
            } else {
                characterStack.push(c);
            }
        }
        return characterStack.isEmpty();
    }

    @Test
    public void should_return_valid_parantheses1() {
        assert (isValid("()"));
    }

    @Test
    public void should_return_valid_parantheses2() {
        assert (isValid("()[]{}"));
    }

    @Test
    public void should_return_valid_parantheses3() {
        assert (!isValid("(]"));
    }

    @Test
    public void should_return_valid_parantheses4() {
        assert (isValid("{[]}"));
    }

    @Test
    public void should_return_valid_parantheses5() {
        assert (!isValid("}"));
    }

}
