package com.practice.ds.success;

public class HelpFromSam {

    public static void main(String[] args) {
        System.out.println(solve(15));
    }

    public static int solve(int A) {
        int count = 0;
        while (A > 0) {
            if ((A & 1) == 1) {
                count++;
            }
            A = A >> 1;
        }
        return count;
    }
}
