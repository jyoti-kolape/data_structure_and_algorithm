package com.practice.ds.scaler;

public class LCM {
    public static void main(String args[]) {
        System.out.println(LCM(2, 3));
    }

    public static int LCM(int A, int B) {
        if (A == 0 || B == 0) {
            return 0;
        }
        int maxNum = 0;
        int minNum = 0;
        if (A > B) {
            maxNum = A;
            minNum = B;
        } else {
            maxNum = B;
            minNum = A;
        }
        int lcm = maxNum;
        while (lcm % minNum != 0) {
            lcm += maxNum;
        }
        return lcm;
    }
}
