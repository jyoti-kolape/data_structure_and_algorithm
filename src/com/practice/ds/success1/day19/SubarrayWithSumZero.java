package com.practice.ds.success1.day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubarrayWithSumZero {
    public static void main(String[] args) {
        Integer[] A = { 1, 2, 3, 4, 5};
        ArrayList<Integer> stuff = new ArrayList<Integer>(Arrays.asList(A));
        System.out.println(solve(stuff));


        /*int[] arr = { 96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87,
                -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62 };
        System.out.println(subArrayExists(arr));*/
    }

    public static int subArrayExists(int arr[]) {
        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                return 1;
            }
        }
        return 0;*/
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)){
                return 1;
            }
            hs.add(sum);
        }
        return 0;

    }
    public static int solve(ArrayList<Integer> A) {
        Set<Integer> hs = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            if (A.get(i) == 0 || sum == 0 || hs.contains(sum)){
                return 1;
            }
            hs.add(sum);
        }
        return 0;
    }
}
