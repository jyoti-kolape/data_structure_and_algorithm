package com.practice.ds.scaler.practice.day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayWithConsecutiveElements {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 1, 1, 5, 5};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int prev = A.get(0);
        for (int i = 1; i <= A.size(); i++) {
            if(prev+1 != A.get(i)){
                return 0;
            }
            prev = A.get(i);
        }
        return 1;
    }
}
