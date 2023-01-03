package com.practice.ds.scaler.practice.day58;


import java.util.Stack;

public class DoubleCharacterTrouble {
    public static void main(String[] args) {
        System.out.println(solve("abccbc"));
    }
    public static String solve(String A) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < A.length(); i++){
            if(!stack.isEmpty()){
                if(A.charAt(i) == stack.peek()){
                    stack.pop();
                    continue;
                }else{
                    stack.push(A.charAt(i));
                }
            }else {
                stack.push(A.charAt(i));
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
