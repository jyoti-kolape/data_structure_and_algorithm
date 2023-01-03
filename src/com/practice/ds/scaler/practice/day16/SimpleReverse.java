package com.practice.ds.scaler.practice.day16;

public class SimpleReverse {
    public static void main(String[] args) {
        System.out.println(solve("academy"));
    }

    public static String solve(String A) {
        String ans = "";
        for(int i = A.length()-1; i>=0; i--){
            ans+=A.charAt(i);
        }
        return ans;
    }
}
