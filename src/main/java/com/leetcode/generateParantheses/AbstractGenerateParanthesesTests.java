package com.leetcode.generateParantheses;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public abstract class AbstractGenerateParanthesesTests {

    abstract public List<String> generateParenthesis(int n);

    public boolean isValid(char[] charArray) {
        Stack<Character> characterStack = new Stack<>();
        for (char c : charArray) {
            if (c == ')') {
                if (characterStack.isEmpty()) {
                    return false;
                }
                char topChar = characterStack.pop();
                if (topChar != '(') {
                    return false;
                }
            } else {
                characterStack.push(c);
            }
        }
        return characterStack.isEmpty();
    }

    @Test
    public void should_contain_all_valid_parantheses_0() {
        assert (generateParenthesis(3).containsAll(Arrays.asList("((()))","(()())","(())()","()(())","()()()")));
    }

    @Test
    public void should_contain_all_valid_parantheses_1() {
        assert (generateParenthesis(1).containsAll(Arrays.asList("()")));
    }

    @Test
    public void should_contain_all_valid_parantheses_2() {
        assert (generateParenthesis(2).containsAll(Arrays.asList("()()", "(())")));
    }

    @Test
    public void should_contain_all_valid_parantheses_3() {
        assert (generateParenthesis(4).containsAll(Arrays.asList("(((())))", "((())())", "(()(()))", "(())(())", "()((()))", "()(())()", "()()(())", "()()()()")));
    }
}
