package com.practice.ds.scaler.practice.day46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimunMoves {
    public static void main(String[] args) {
        Integer[] arr1 = {123, 543};
        Integer[] arr2 = {321, 279};
        List<Integer> A = new ArrayList<Integer>(Arrays.asList(arr1));
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(arr2));
        System.out.println(minimumMoves(A, B));
    }

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int count = 0;
        for (int i = 0; i < arr1.size(); i++) {
            Integer integer1 = arr1.get(i);
            Integer integer2 = arr2.get(i);
            count = count + getCount(integer1, integer2);
        }
        return count;
    }

    private static int getCount(Integer integer1, Integer integer2) {
        String s1 = String.valueOf(integer1);
        String s2 = String.valueOf(integer2);
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int a = c1 - '0';
            int b = c2 - '0';
            if (a < b) {
                count = count + b - a;
            } else {
                count = count + a - b;
            }
        }
        return count;
    }
}
