package com.practice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] arr = {34, 7, 4, 10, 5, 1, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(quickSort(list, 0, list.size() - 1));
    }

    public static List<Integer> quickSort(List<Integer> list, int start, int end) {
        if (start < end) {
            int pivot = partition1(list, start, end);
            quickSort(list, start, pivot - 1);
            quickSort(list, pivot + 1, end);
        }
        return list;
    }

    public static int partition(List<Integer> list, int start, int end) {
        int pivot = list.get(end);
        int i = -1;
        for (int j = start; j < list.size(); j++) {
            if (list.get(j) < pivot) {
                i++;
               swap(list, i, j);
            }
        }
        swap(list, i+1, end);
        return i + 1;
    }

    static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j)) ;
        list.set(j, temp);
    }

    public static int partition1(List<Integer> list, int start, int end) {
        int pivot = list.get(end);
        int iPivot =  start;
        for (int i = start; i < end-1; i++) {
            if (list.get(i) <= pivot) {
                int temp = list.get(i);
                list.set(i, list.get(iPivot)) ;
                list.set(iPivot, temp);
                iPivot++;
            }
        }
        return iPivot;
    }
}
