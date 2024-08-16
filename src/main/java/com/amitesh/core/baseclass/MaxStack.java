package com.amitesh.core.baseclass;

import java.util.Stack;

public class MaxStack {

    Stack<Integer> stack;
    Stack<Integer> maxStack;

    MaxStack() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty() || x > maxStack.peek()) {
            maxStack.push(x);
        } else {
            maxStack.push(maxStack.peek());
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        maxStack.pop();
        return stack.pop();
    }

    public int top() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek();
    }

    public int peekMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Max Stack is empty");
        }
        return maxStack.peek();
    }

    public int popMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Max Stack is empty");
        }
        Stack<Integer> buffer = new Stack<>();
        int temp = peekMax();
        while (top() != temp) {
            buffer.push(pop());
        }
        pop();
        while (!buffer.isEmpty()) {
            push(buffer.pop());
        }
        return temp;
    }
}
