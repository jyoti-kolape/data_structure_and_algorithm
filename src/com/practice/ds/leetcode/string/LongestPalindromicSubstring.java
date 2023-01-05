package com.practice.ds.leetcode.string;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("baba"));
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        int mid1 = 0;
        int mid2 = 0;
        if (len % 2 != 0) {
            mid1 = len / 2;
        } else {
            mid2 = len / 2;
            mid1 = mid2 - 1;
        }
        return null;
    }
}
