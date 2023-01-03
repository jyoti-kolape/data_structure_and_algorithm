package com.practice.ds.scaler.practice.day41;

public class KthSymbol {
    public static void main(String[] args) {
        System.out.println(solve(9, 175));

    }

    public static int solve(int A, int B) {
        if (A == 0) {
            return 0;
        }
        if (B % 2 == 0) {
            if (solve(A - 1, B / 2) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (solve(A - 1, (B + 1) / 2) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
