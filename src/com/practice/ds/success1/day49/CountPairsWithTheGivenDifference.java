package com.practice.ds.success1.day49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class CountPairsWithTheGivenDifference {
    public static void main(String[] args) {
        Integer[] arr1 = {8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        //Collections.sort(A);
        System.out.println(solve(A, 3));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int result = 0;
        Collections.sort(A);
        //Arrays.sort(array);
        int i = 0;
        int j = 1;
        while (i < A.size() && j < A.size()) {
            if (i != j && A.get(j) - A.get(i) == B) {
                result++;
                i++;
                j++;
            } else if (A.get(j) - A.get(i) < B) {
                j++;
            } else {
                i++;
            }
        }


        return result;
    }
}
