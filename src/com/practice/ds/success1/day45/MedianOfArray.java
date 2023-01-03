package com.practice.ds.success1.day45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfArray {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(arr1));

        Integer[] arr2 = {4};
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(arr2));
        System.out.println(findMedianSortedArrays(A, B));
    }

    public static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            list.add(a.get(i));
        }

        for (int i = 0; i < b.size(); i++) {
            list.add(b.get(i));
        }
        Collections.sort(list);
        int start = 0;
        int end = list.size() - 1;
        int mid = start + (end - start) / 2;
        if (list.size() % 2 == 0) {
            final int i = list.get(mid) + list.get(mid + 1);
            return Double.valueOf(i) /Double.valueOf(2.0);
        } else {
            final Integer integer = list.get(mid);
            return Double.valueOf(integer);
        }
    }
}
