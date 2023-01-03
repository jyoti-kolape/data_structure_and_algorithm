package com.practice.ds.scaler.practice.day24;

public class IsMagic {
    public static void main(String[] args) {
        System.out.println(solve(83557));
    }

    public static int solve(int A) {
        int sum = 0;
        while (A > 0 || sum > 9) {
            if (A == 0) {
                A = sum;
                sum = 0;
            }
            sum += A % 10;
            A /= 10;
        }
        if (sum == 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
