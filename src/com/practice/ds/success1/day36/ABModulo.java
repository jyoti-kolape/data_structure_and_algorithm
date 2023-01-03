package com.practice.ds.success1.day36;

public class ABModulo {
    public static int solve(int A, int B) {
        if (A > B) {
            return A - B;
        } else {
            return B - A;
        }

    }

    public static void main(String[] args) {
        System.out.println(solve(16, 4));
    }
}
