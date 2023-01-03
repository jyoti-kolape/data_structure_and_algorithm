package com.practice.ds.success1.day42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMod {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 6, 4};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A));
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int first = A.get(A.size() - 1);
        int secondLargest = A.get(0);
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != first && A.get(i) < first) {
                if (A.get(i) > secondLargest) {
                    secondLargest = A.get(i);
                }
            }
        }
        return secondLargest % first;
    }
}
