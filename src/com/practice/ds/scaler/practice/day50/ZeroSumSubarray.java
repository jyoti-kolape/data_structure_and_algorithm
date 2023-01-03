package com.practice.ds.scaler.practice.day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {

    public static void main(String[] args) {
        Integer[] arr1 = {-1, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Set<Long> hs = new HashSet<>();
        Long sum = 0l;
        for (int i = 0; i < A.size(); i++) {
            sum += Long.valueOf(A.get(i));
            if (A.get(i) == 0 || sum == 0 || hs.contains(sum)) {
                return 1;
            }
            hs.add(sum);
        }

        return 0;
    }
}
