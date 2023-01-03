package com.practice.ds.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        Integer[] arr = {34, 7, 4, 10, 5, 1, 100};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(selectionSort(list));
    }

    public static List<Integer> selectionSort(List<Integer> list) {
        for (int index = 0; index < list.size(); index++) {
            int minIndex = index;
            for (int j = index + 1; j < list.size(); j++) {
                if (list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }
            }

            if (list.get(index) > list.get(minIndex)) {
                int temp = list.get(index);
                list.set(index, list.get(minIndex));
                list.set(minIndex, temp);
            }

        }
        return list;
    }

}
