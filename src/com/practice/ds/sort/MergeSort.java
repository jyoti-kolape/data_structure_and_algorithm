package com.practice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] arr = {34, 7, 4, 10, 5, 1, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(mergeSort(list));
    }

    public static List<Integer> mergeSort(List<Integer> list) {
        int end = list.size();
        int start = 0;
        if (end < 2) {
            return list;
        } else {
            int mid = start + (end - 1) / 2;
            List<Integer> leftList = new ArrayList<>();
            List<Integer> rightList = new ArrayList<>();
            for (int i = start; i <= mid; i++) {
                leftList.add(list.get(i));
            }

            for (int i = mid + 1; i < end; i++) {
                rightList.add(list.get(i));
            }

            mergeSort(leftList);
            mergeSort(rightList);
            merge(leftList, rightList, list);

        }
        return list;
    }

    public static void merge(List<Integer> leftList, List<Integer> rightList, List<Integer> list) {
        int nL = leftList.size();
        int nR = rightList.size();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nL && j < nR) {
            if (leftList.get(i) > rightList.get(j)) {
                list.set(k, rightList.get(j));
                j++;
            } else {
                list.set(k, leftList.get(i));
                i++;
            }
            k++;
        }

        while (i < nL) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < nR) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}
