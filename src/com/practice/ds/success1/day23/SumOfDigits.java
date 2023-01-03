package com.practice.ds.success1.day23;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(solve(46));
    }

    public static int solve(int A) {
        if (A == 0) {
            return 0;
        } else {
            return (A % 10 + solve(A / 10));
        }
    }
}
