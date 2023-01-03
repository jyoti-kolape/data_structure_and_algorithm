package com.practice.ds.scaler.practice.day58;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {
        System.out.println(solve("{([])}"));
    }

    public static int solve(String A) {
        Stack stack = new Stack();
        char[] charArray = A.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char current = charArray[i];
            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
                continue;
            }
            if (stack.isEmpty()) {
                return 0;
            }

            char popChar;
            switch (current) {
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '{' || popChar == '[')
                        return 0;
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '[')
                        return 0;
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '{')
                        return 0;
                    break;
            }
        }

        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
    // main() method start
    /*public static void main(String[] args) {

        String inputStr;

        // create an instance of Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to check:");
        // take input sring from user
        inputStr = sc.nextLine();

        // call balancedParenthesis() method to check whether input string is balanced of not
        if (balancedParenthesis(inputStr))
            System.out.println("Input string "+inputStr+" is balanced.");
        else
            System.out.println("Input string "+inputStr+" is not balanced.");
    }*/

}
