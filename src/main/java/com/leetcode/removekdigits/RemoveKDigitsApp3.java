package com.leetcode.removekdigits;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigitsApp3 extends AbstractParent {

    /**
     * timelimit exceeded for TC- should_give_correct_op9() - input string = 10k , k = 1000
     * new approach - start from left and try to remove the max no between
     *
     * @param num
     * @param k
     * @return
     */
    @Override
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) {
            return "0";
        }

        Deque<Character> stack = new ArrayDeque<>();
        char[] charArr = num.toCharArray();
        for (char c : charArr) {
            while (k > 0 && !stack.isEmpty() && stack.peekLast() > c) {
                stack.removeLast();
                k--;
            }
            stack.addLast(c);
        }

        while (k > 0) {
            stack.removeLast();
            k--;
        }

        // Remove all zeros from the front of the stack and then if stack is empty, return "0"
        while (!stack.isEmpty() && stack.peekFirst() == '0')
            stack.removeFirst();


        if (stack.isEmpty())
            return "0";

        // build the number from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }
}
