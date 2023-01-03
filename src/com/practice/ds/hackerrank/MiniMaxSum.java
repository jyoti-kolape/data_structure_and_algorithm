package com.practice.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        List<Integer> A = new ArrayList<>(Arrays.asList(arr1));
        miniMaxSum(A);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        int minElement = arr.get(0);
        int maxElement = arr.get(0);
        long sum = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (minElement > arr.get(i)) {
                minElement = arr.get(i);
            } else if (maxElement < arr.get(i)) {
                maxElement = arr.get(i);
            }
            sum += arr.get(i);
        }
        System.out.print((sum - minElement) + " " + (sum - maxElement));

    }


}

