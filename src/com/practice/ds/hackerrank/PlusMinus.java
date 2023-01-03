package com.practice.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        Integer[] arr1 = {-4, 3, -9, 0, 4, 1};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        plusMinus(A);
    }

    public static void plusMinus(List<Integer> arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            if (arr.get(i) == 0) {
                zeroCount++;
            } else if (arr.get(i) < 0) {
                negCount++;
            } else {
                posCount++;
            }
        }
        System.out.printf("%1.5f ", posCount / (double) len);
        System.out.println();
        System.out.printf("%1.5f ", negCount / (double) len);
        System.out.println();
        System.out.printf("%1.5f ", zeroCount / (double) len);
        System.out.println();

    }
}
