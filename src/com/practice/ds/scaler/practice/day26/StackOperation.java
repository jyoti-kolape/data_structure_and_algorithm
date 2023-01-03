package com.practice.ds.scaler.practice.day26;

import java.util.Stack;

public class StackOperation {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int num = stack.pop();
            if (num == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty())
            return -1;
        return minStack.peek();
    }

}
