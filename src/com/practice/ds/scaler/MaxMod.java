package com.practice.ds.scaler;

import java.util.Arrays;

public class MaxMod {
    public static void main(String args[]) {
        int[] A = {927, 707, 374, 394, 279, 799, 878, 937, 431, 112};
        System.out.println(MaxMod.solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int first = A[A.length-1];
        int second = 0;
        for (int i = A.length-1; i >= 0; i--) {
            if (A[i] != first && A[i]< first) {
                second = A[i];
                break;
            }
        }
        System.out.println(first);
        System.out.println(second);
        return second % first;
    }
}
