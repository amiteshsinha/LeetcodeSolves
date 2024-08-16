package com.leetcode.reverseParantheses;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseParenthesis extends AbstractParent {

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 54.97%
     *
     * Memory
     * 41.66
     * MB
     * Beats
     * 63.19%
     * @param s
     * @return
     */
    // only need to reverse what is in the parenthesis - rest of it needs to be as is
    @Override
    public String reverseParentheses(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArr = s.toCharArray();
        boolean bracketStarted = false;
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '(') {
                bracketStarted = true;
            }
            if (bracketStarted) {// get string reverse
                if (charArr[i] == ')') {
                    while (stack.peek() != '(') {
                        queue.offer(stack.pop());
                    }
                    stack.pop();
                    if (stack.isEmpty()) {
                        bracketStarted = false;
                        if (!queue.isEmpty()) {
                            while (!queue.isEmpty()) {
                                stringBuilder.append(queue.poll());
                            }
                        }
                    }
                    while (!queue.isEmpty() && bracketStarted) {
                        stack.push(queue.poll());
                    }
                } else {
                    stack.push(charArr[i]);
                }
            } else {
                stringBuilder.append(charArr[i]);
            }
        }
        if (!queue.isEmpty()) {
            while (!queue.isEmpty()) {
                stringBuilder.append(queue.poll());
            }
        }
        return stringBuilder.toString();
    }
}
