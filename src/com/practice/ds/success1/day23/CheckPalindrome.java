package com.practice.ds.success1.day23;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(solve("madam"));
    }

    public static int solve(String A) {
        if (isPalindrome(A)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean isPalindrome(String A) {
        if (A.length() == 1 || A.length() == 0) {
            return true;
        } else if (A.charAt(0) == A.charAt(A.length() - 1)) {
            return isPalindrome(A.substring(1, A.length() - 1));
        } else {
            return false;
        }
    }
}
