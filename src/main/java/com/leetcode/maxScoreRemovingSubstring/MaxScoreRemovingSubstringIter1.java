package com.leetcode.maxScoreRemovingSubstring;

import java.util.Stack;

public class MaxScoreRemovingSubstringIter1 extends AbstractParent {

    // ab is x points , ba is y points
    // start counting from left about count of a and b = if count is not zero for both then we can consume
    // them so if we get b first then a and we have
    @Override
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack = new Stack<>();
        char[] charArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            stack.push(charArr[i]);
        }
        if (y > x) {
            return getScore(y, x, stack, 'b','a');
        } else {
            return getScore(x, y, stack, 'a', 'b');
        }
    }

    private int getScore(int x, int y, Stack<Character> stack, char first, char second) {
        char c;
        int score = 0;
        Stack<Character> temp = new Stack<>();
        while (!stack.isEmpty()) {
            c = stack.pop();
            if (c == second && !stack.isEmpty() && stack.peek() == first) {
                stack.pop();
                score += x;
            } else if (c == first && !temp.isEmpty() && temp.peek() == second) {
                temp.pop();
                score += x;
            }else {
                temp.push(c);
            }
        }
        while (!temp.isEmpty()) {
            c = temp.pop();
            if (c == second && !temp.isEmpty() && temp.peek() == first) {
                temp.pop();
                score += y;
            } else if (c == first && !stack.isEmpty() && stack.peek() == second) {
                stack.pop();
                score += y;
            } else {
                stack.push(c);
            }
        }
        return score;
    }
}

/**
 * if (charArr[i] == 'b' && !stack.isEmpty() && stack.peek() == 'a') {
 * stack.pop();
 * // stack had a and we are trying to put b
 * score += x;
 * } else if (charArr[i] == 'a' && !stack.isEmpty() && stack.peek() == 'b') {
 * stack.pop();
 * score += y;
 * } else {
 */