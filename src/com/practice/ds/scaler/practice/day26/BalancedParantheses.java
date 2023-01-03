package com.practice.ds.scaler.practice.day26;

import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        System.out.println(solve("(()){[]}"));
    }

    public static int solve(String A) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return 0;
            } else if (ch == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return 0;
                }

            } else if (ch == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return 0;
                }

            } else if (ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return 0;
                }
            }
        }
        if (!stack.isEmpty()) {
            return 0;
        }
        return 1;
    }
}
