package com.practice.ds.scaler.practice.day58;

import java.util.*;

public class EvaluateExpression {
    public static void main(String[] args) {
        String[] arr1 = {"5"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(evalRPN(A));
    }

    public static int evalRPN(ArrayList<String> A) {
        int res = 0;
        Stack<String> stack = new Stack<>();
        Set<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("/");
        set.add("*");
        for (int i = 0; i < A.size(); i++) {
            if (set.contains(A.get(i))) {
                int val1 = Integer.parseInt(stack.pop());
                int val2 = Integer.parseInt(stack.pop());

                if (A.get(i).equals("+")) {
                    res = val2 + val1;
                }
                if (A.get(i).equals("-")) {
                    res = val2 - val1;
                }

                if (A.get(i).equals("/")) {
                    res = val2 / val1;
                }
                if (A.get(i).equals("*")) {
                    res = val2 * val1;
                }
                stack.push(String.valueOf(res));
            } else {
                stack.push(A.get(i));
            }

        }
        return Integer.parseInt(stack.pop());
    }
}
