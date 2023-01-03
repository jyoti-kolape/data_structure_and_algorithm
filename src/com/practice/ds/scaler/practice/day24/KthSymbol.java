package com.practice.ds.scaler.practice.day24;

public class KthSymbol {
    public static void main(String[] args) {
        System.out.println(solve(2, 1));
    }

    public static int solve(int A, int B) {
        if (A == 1) return 0;
        if (B % 2 == 0) {
            return solve(A - 1, B / 2) == 0 ? 1 : 0;
        } else {
            return solve(A - 1, (B + 1) / 2);
        }
    }

}
