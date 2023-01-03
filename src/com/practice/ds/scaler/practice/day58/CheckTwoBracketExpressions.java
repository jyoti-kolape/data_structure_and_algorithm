package com.practice.ds.scaler.practice.day58;

import java.util.LinkedList;
import java.util.Queue;

public class CheckTwoBracketExpressions {
    public static void main(String[] args) {
        //System.out.println(solve("a-b-(c-d)", "a-b-c-d"));
        System.out.println(solve("-(-(-(-a+b)-d+c)-q)", "a-b-d+c+q"));

    }

    public static int solve(String A, String B) {
        char operator='+';
        boolean flag = false;
        Queue<Character> stack = new LinkedList<>();
        for (int i = 0; i < A.length(); i++) {
            if (!flag) {
                if (A.charAt(i) == '-' || A.charAt(i) == '+') {
                    operator = A.charAt(i);
                }
            }

            if (A.charAt(i) == '(') {
                flag = true;
                continue;
            }

            if (flag) {
                if (A.charAt(i) == '-' && operator == '-') {
                    stack.add('+');
                } else if ((A.charAt(i) == '+' && operator == '-') || (A.charAt(i) == '-' && operator == '+')) {
                    stack.add('-');
                } else {
                    if (A.charAt(i) != ')') {
                        stack.add(A.charAt(i));
                    }
                }
            } else {
                if (A.charAt(i) != ')') {
                    stack.add(A.charAt(i));
                }
            }
            if (A.charAt(i) == ')') {
                flag = false;
            }
        }
        String str = "";
        while (!stack.isEmpty()) {
            str += stack.remove();
        }

        if (str.equals(B) || ("("+str+")").equals(B)) {
            return 1;
        }
        return 0;
    }
}
