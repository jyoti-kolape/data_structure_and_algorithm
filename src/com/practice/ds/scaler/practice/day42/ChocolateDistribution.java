package com.practice.ds.scaler.practice.day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Integer[] arr1 = {3, 4, 1, 9, 56, 7, 9, 12};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 5));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        if (B == 0 || A.size() == 0){
            return 0;
        }

        Collections.sort(A);

        if (A.size() < B){
            return -1;
        }

        int min_diff = Integer.MAX_VALUE;

        for (int i = 0; i + B - 1 < A.size(); i++) {
            int diff = A.get(i + B - 1) - A.get(i);
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
}
