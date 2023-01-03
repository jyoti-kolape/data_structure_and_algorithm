package com.practice.ds.success1.day16;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(solve("axax"));
    }

    public static int solve(String A) {
        int ans = 0;
        String str = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            str += A.charAt(i);
        }
        if (A.equals(str)) {
            ans = 1;
        }
        return ans;
    }
}
