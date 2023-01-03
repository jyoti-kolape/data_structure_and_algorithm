package com.practice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        Integer[] arr = {34, 7, 4, 10, 5, 1, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(insertionSort(list));
    }

    public static List<Integer> insertionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, key);
        }
        return list;
    }
}
