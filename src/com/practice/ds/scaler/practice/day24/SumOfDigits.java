package com.practice.ds.scaler.practice.day24;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(sum(56));
    }

    public static int sum(int A) {
        if (A == 0) {
            return 0;
        } else {
            return (A % 10 + sum(A / 10));
        }
    }
}

