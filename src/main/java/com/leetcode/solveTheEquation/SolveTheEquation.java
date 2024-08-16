package com.leetcode.solveTheEquation;

import java.util.Stack;

public class SolveTheEquation extends AbstractParent {

    int currCoeff = 0, currVal = 0;

    /**
     * Runtime
     * 4
     * ms
     * Beats
     * 47.09%
     *
     * Memory
     * 41.62
     * MB
     * Beats
     * 32.56%
     * @param equation
     * @return
     */
    @Override
    public String solveEquation(String equation) {
        int leftCoeff = 0, rightCoeff = 0, leftVal = 0, rightVal = 0;
        int temp;
        String[] stringArr = equation.split("=");
        for (int j = 0; j < 2; j++) {
            char[] left = stringArr[j].toCharArray();
            currCoeff = 0;
            currVal = 0;
            Stack<Character> characterStack = new Stack<>();
            for (int i = 0; i < left.length; i++) {
                if (left[i] == '+' || left[i] == '-') {
                    if (characterStack.isEmpty()) {
                        characterStack.push(left[i]);
                    } else {
                        processStack(characterStack);
                    }
                    characterStack.push(left[i]);
                } else {
                    characterStack.push(left[i]);
                }
            }
            processStack(characterStack);
            if (j == 0) {
                leftCoeff = currCoeff;
                leftVal = currVal;
            } else {
                rightCoeff = currCoeff;
                rightVal = currVal;
            }
        }
        if (leftCoeff == rightCoeff) {
            if (leftVal != rightVal) {
                return NO_SOLUTION;
            }
            return INFINITE_SOLUTIONS;
        } else {
            temp = (rightVal - leftVal) / (leftCoeff - rightCoeff);
            return "x=" + temp;
        }
    }

    void processStack(Stack<Character> characterStack) {
        int temp;
        String currentchar;
        if (characterStack.isEmpty()) {
            return;
        }
        if (characterStack.peek() == 'x') {
            characterStack.pop();
            if (characterStack.isEmpty()) {
                currCoeff = 1;
                return;
            } else {
                temp = 1;
                currentchar = "";
                while (!characterStack.isEmpty() && characterStack.peek() != '+' && characterStack.peek() != '-') {
                    currentchar = currentchar + characterStack.pop();
                }
                if (currentchar != "") {
                    temp = Integer.parseInt(new StringBuilder(currentchar).reverse().toString());
                }
                if (characterStack.isEmpty()) {
                    currCoeff = temp;
                } else {
                    if (characterStack.peek() == '+') {
                        currCoeff += temp;
                    } else {
                        currCoeff -= temp;
                    }
                    characterStack.pop();
                }
            }
        } else {
            currentchar = characterStack.pop() + "";
            while (!characterStack.isEmpty() && characterStack.peek() != '+' && characterStack.peek() != '-') {
                currentchar = currentchar + characterStack.pop();
            }
            temp = Integer.parseInt(new StringBuilder(currentchar).reverse().toString());
            if (characterStack.isEmpty()) {
                currVal = temp;
            } else {
                if (characterStack.peek() == '+') {
                    currVal += temp;
                } else {
                    currVal -= temp;
                }
                characterStack.pop();
            }
        }
    }
}
