package com.practice.ds.scaler.practice.day49;

import java.util.ArrayList;
import java.util.Arrays;

public class CountPairsWithTheGivenSum {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        System.out.println(solve(A, 5));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int i = 0;
        int j = A.size() - 1;
        int count = 0;
        while (i < j) {
            if (A.get(i) + A.get(j) < B) {
                i++;
            } else if (A.get(i) + A.get(j) == B) {
                count++;
                i++;
                j--;
            } else if (A.get(i) + A.get(j) > B) {
                j--;
            }
        }
        return count;
    }
}
