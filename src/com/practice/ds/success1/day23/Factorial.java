package com.practice.ds.success1.day23;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static int solve(int A) {
        if (A == 1) {
            return 1;
        } else {
            return solve(A - 1) * A;
        }
    }
}
