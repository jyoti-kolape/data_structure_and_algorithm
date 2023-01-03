package com.practice.ds.scaler.practice.day18;

import java.util.ArrayList;
import java.util.Collections;

public class ArithmeticProgression {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(4);
        A.add(1);
        System.out.println(solve(A));

    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int ans = 0;
        int diff = A.get(1) - A.get(0);
        for (int i = 1; i < A.size(); i++) {
            int temp = A.get(i) - A.get(i - 1);
            if (A.get(i) - A.get(i - 1) == diff) {
                ans = 1;
            } else {
                ans = 0;
                return ans;
            }
        }
        return ans;
    }
}
